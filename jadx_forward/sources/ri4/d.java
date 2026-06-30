package ri4;

/* loaded from: classes11.dex */
public final class d implements ri4.a {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f477627a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f477628b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f477629c;

    public d(l75.k0 db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f477627a = db6;
        this.f477628b = jz5.h.b(new ri4.b(this));
        this.f477629c = new java.util.HashMap();
    }

    public int A(int i17) {
        java.lang.String str;
        mj4.f y17 = y();
        if (i17 < 0) {
            str = "select count(rowid) from TextStatusComment where Read != 1 and DeleteInMsgList != 1";
        } else {
            y17.getClass();
            str = "select count(rowid) from TextStatusComment where Read != 1 and CreateTime >= " + i17 + " and DeleteInMsgList != 1";
        }
        android.database.Cursor B = y17.f408593d.B(str, null);
        if (B != null) {
            r1 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentStorage", "getUnreadCount: size=" + r1 + ", afterTime=" + i17);
        return r1;
    }

    @Override // qi4.a
    public void d(qi4.b observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        ri4.c cVar = new ri4.c(observer);
        y().add(cVar);
        this.f477629c.put(observer, cVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusCommentNativeStorage", "observe: " + observer.hashCode());
    }

    public java.util.List x() {
        mj4.f y17 = y();
        y17.getClass();
        java.util.LinkedList<mj4.e> linkedList = new java.util.LinkedList();
        android.database.Cursor B = y17.f408593d.B("select rowid, * from TextStatusComment where DeleteInMsgList != 1 order by CreateTime DESC ", null);
        if (B != null) {
            while (B.moveToNext()) {
                mj4.e eVar = new mj4.e();
                eVar.mo9015xbf5d97fd(B);
                linkedList.add(eVar);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentStorage", "getAllInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.e eVar2 : linkedList) {
                arrayList.add(eVar2.f76554xb8f426b5 + '_' + eVar2.f76552xa8350b1f);
            }
            arrayList.toString();
        }
        return linkedList;
    }

    public final mj4.f y() {
        return (mj4.f) ((jz5.n) this.f477628b).mo141623x754a37bb();
    }

    public java.util.List z() {
        mj4.f y17 = y();
        y17.getClass();
        java.util.LinkedList<mj4.e> linkedList = new java.util.LinkedList();
        android.database.Cursor B = y17.f408593d.B("select rowid,* from TextStatusComment where Read != 1 and DeleteInMsgList != 1", null);
        if (B != null) {
            while (B.moveToNext()) {
                mj4.e eVar = new mj4.e();
                eVar.mo9015xbf5d97fd(B);
                linkedList.add(eVar);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCommentStorage", "getUnreadInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.e eVar2 : linkedList) {
                arrayList.add(eVar2.f76554xb8f426b5 + '_' + eVar2.f76552xa8350b1f);
            }
            arrayList.toString();
        }
        return linkedList;
    }
}
