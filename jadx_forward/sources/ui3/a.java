package ui3;

/* loaded from: classes5.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f509642e = {l75.n0.m145250x3fdc6f77(ui3.b.f509646x, "MsgQuote")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f509643f = {"CREATE INDEX IF NOT EXISTS quotedMsgSvrIdIndex ON MsgQuote ( quotedMsgSvrId )", "CREATE INDEX IF NOT EXISTS quotedMsgLocalIdTalkerIndex ON MsgQuote ( msgId,quotedMsgTalker ) "};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f509644g = {"CREATE INDEX IF NOT EXISTS quotedMsgSvrIdTalkerIndex ON MsgQuote ( quotedMsgSvrId,quotedMsgTalker ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f509645d;

    public a(l75.k0 k0Var, java.lang.String[] strArr) {
        super(k0Var, ui3.b.f509646x, "MsgQuote", strArr);
        this.f509645d = k0Var;
        qt0.b.f448024a.b(new qt0.e(k0Var, f509644g, "MsgQuote", null, 0));
    }

    public ui3.b D0(java.lang.String str, long j17) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "quotedMsgSvrId:%s", java.lang.Long.valueOf(j17));
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pt0.p.B3("MsgQuote")) {
            android.database.Cursor E = this.f509645d.E("MsgQuote", ui3.b.f509646x.f398487c, "quotedMsgSvrId=? and quotedMsgTalker=?", new java.lang.String[]{j17 + "", str}, null, null, null);
            if (E == null) {
                return null;
            }
            while (E.moveToNext()) {
                ui3.b bVar = new ui3.b();
                bVar.mo9015xbf5d97fd(E);
                bVar.f66420x66425b6d = str;
                arrayList.add(bVar);
            }
            E.close();
        } else {
            android.database.Cursor E2 = this.f509645d.E("MsgQuote", ui3.b.f509646x.f398487c, "quotedMsgSvrId=?", new java.lang.String[]{j17 + ""}, null, null, null);
            if (E2 == null) {
                return null;
            }
            while (E2.moveToNext()) {
                ui3.b bVar2 = new ui3.b();
                bVar2.mo9015xbf5d97fd(E2);
                arrayList.add(bVar2);
            }
            E2.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ui3.b) arrayList.get(0);
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(ui3.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(bVar.f66420x66425b6d)) {
            bVar.f66420x66425b6d = "";
        }
        pt0.p.G6(bVar.f66418xb3e44c2f, bVar.f66420x66425b6d);
        pt0.p.G6(bVar.f66416x297eb4f7, bVar.f66420x66425b6d);
        bVar.f66421x10a0fed7 = 0;
        return super.mo880xb970c2b9(bVar);
    }

    public boolean L0(ui3.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(bVar.f66420x66425b6d)) {
            bVar.f66420x66425b6d = "";
        }
        pt0.p.G6(bVar.f66418xb3e44c2f, bVar.f66420x66425b6d);
        pt0.p.G6(bVar.f66416x297eb4f7, bVar.f66420x66425b6d);
        return super.mo880xb970c2b9(bVar);
    }

    public boolean P0(ui3.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(bVar.f66420x66425b6d)) {
            bVar.f66420x66425b6d = "";
        }
        return mo11261xce0038c9(bVar.f72763xa3c65b86, bVar);
    }

    public ui3.b y0(java.lang.String str, long j17) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "getMsgQuteByMsgId:%s", java.lang.Long.valueOf(j17));
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pt0.p.B3("MsgQuote")) {
            android.database.Cursor E = this.f509645d.E("MsgQuote", ui3.b.f509646x.f398487c, "msgId=? and quotedMsgTalker=?", new java.lang.String[]{j17 + "", str}, null, null, null);
            if (E == null) {
                return null;
            }
            while (E.moveToNext()) {
                ui3.b bVar = new ui3.b();
                bVar.mo9015xbf5d97fd(E);
                bVar.f66420x66425b6d = str;
                arrayList.add(bVar);
            }
            E.close();
        } else {
            android.database.Cursor E2 = this.f509645d.E("MsgQuote", ui3.b.f509646x.f398487c, "msgId=?", new java.lang.String[]{j17 + ""}, null, null, null);
            if (E2 == null) {
                return null;
            }
            while (E2.moveToNext()) {
                ui3.b bVar2 = new ui3.b();
                bVar2.mo9015xbf5d97fd(E2);
                arrayList.add(bVar2);
            }
            E2.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ui3.b) arrayList.get(0);
    }

    public ui3.b z0(java.lang.String str, long j17) {
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.msgquote.MsgQuoteStorage", "quotedMsgId:%s", java.lang.Long.valueOf(j17));
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (pt0.p.B3("MsgQuote")) {
            android.database.Cursor E = this.f509645d.E("MsgQuote", ui3.b.f509646x.f398487c, "quotedMsgId=? and quotedMsgTalker=?", new java.lang.String[]{j17 + "", str}, null, null, null);
            if (E == null) {
                return null;
            }
            while (E.moveToNext()) {
                ui3.b bVar = new ui3.b();
                bVar.mo9015xbf5d97fd(E);
                bVar.f66420x66425b6d = str;
                arrayList.add(bVar);
            }
            E.close();
        } else {
            android.database.Cursor E2 = this.f509645d.E("MsgQuote", ui3.b.f509646x.f398487c, "quotedMsgId=?", new java.lang.String[]{j17 + ""}, null, null, null);
            if (E2 == null) {
                return null;
            }
            while (E2.moveToNext()) {
                ui3.b bVar2 = new ui3.b();
                bVar2.mo9015xbf5d97fd(E2);
                arrayList.add(bVar2);
            }
            E2.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (ui3.b) arrayList.get(0);
    }
}
