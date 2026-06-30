package ti4;

/* loaded from: classes11.dex */
public final class d implements ti4.a {

    /* renamed from: a, reason: collision with root package name */
    public final l75.k0 f501182a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f501183b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f501184c;

    public d(l75.k0 db6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f501182a = db6;
        this.f501183b = jz5.h.b(new ti4.b(this));
        this.f501184c = new java.util.HashMap();
    }

    public int A(int i17) {
        java.lang.String str;
        mj4.n z17 = z();
        if (i17 < 0) {
            str = "select count(rowid) from TextStatusLike where Read != 1 and DeleteInMsgList != 1";
        } else {
            z17.getClass();
            str = "select count(rowid) from TextStatusLike where Read != 1 and CreateTime > " + i17 + " and DeleteInMsgList != 1";
        }
        android.database.Cursor B = z17.f408610d.B(str, null);
        if (B != null) {
            r1 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getUnreadCount: count=" + r1 + ", afterTime=" + i17);
        return r1;
    }

    @Override // qi4.a
    public void d(qi4.b observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        ti4.c cVar = new ti4.c(observer);
        z().add(cVar);
        this.f501184c.put(observer, cVar);
    }

    public java.util.List x() {
        mj4.n z17 = z();
        z17.getClass();
        java.util.LinkedList<mj4.l> linkedList = new java.util.LinkedList();
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        android.database.Cursor B = z17.f408610d.B("select rowid, * from TextStatusLike where HashUserName != ? and DeleteInMsgList != 1 order by CreateTime DESC ", new java.lang.String[]{k17});
        if (B != null) {
            while (B.moveToNext()) {
                mj4.l lVar = new mj4.l();
                lVar.mo9015xbf5d97fd(B);
                linkedList.add(lVar);
            }
            B.close();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getAllInfos: size=" + linkedList.size());
        if (!linkedList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (mj4.l lVar2 : linkedList) {
                arrayList.add(lVar2.f76611x5493d43f + '_' + lVar2.f76604x3554d688 + '_' + lVar2.f76601x81959a6e + '_' + lVar2.f76607xcd7d4a17);
            }
            arrayList.toString();
        }
        return linkedList;
    }

    public java.util.List y() {
        mj4.n z17 = z();
        z17.getClass();
        java.lang.String k17 = gm0.j1.b().k();
        if (k17 == null) {
            k17 = "";
        }
        if (k17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getSelfAllLikeInfos: myUserName empty");
            return kz5.p0.f395529d;
        }
        p75.n0 n0Var = rj4.e.f477823v;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = rj4.e.f477825x.j(k17).c(rj4.e.f477827z.i(0));
        linkedList2.add(rj4.e.f477826y.u());
        p75.i0 g17 = rj4.e.f477823v.g(linkedList);
        g17.f434190d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        java.util.List k18 = g17.a().k(z17.f408610d, mj4.l.class);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusLikeStorage", "getSelfAllLikeInfos: " + ((java.util.ArrayList) k18).size());
        return k18;
    }

    public final mj4.n z() {
        return (mj4.n) ((jz5.n) this.f501183b).mo141623x754a37bb();
    }
}
