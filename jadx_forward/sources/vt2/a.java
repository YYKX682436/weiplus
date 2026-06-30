package vt2;

/* loaded from: classes3.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vt2.c f521468a;

    public a(vt2.c cVar) {
        this.f521468a = cVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        vt2.c cVar = this.f521468a;
        if (b17) {
            bw5.wk wkVar = (bw5.wk) ke2.o0.f388509v.a(fVar, new bw5.wk());
            boolean z17 = true;
            java.lang.String str = wkVar != null ? wkVar.f116288e[1] ? wkVar.f116287d : "" : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cVar.f521478f, "type " + cVar.f521473a + " productID " + cVar.f521474b + " success wording " + str);
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(cVar.f521475c);
                e4Var.f293309c = str;
                e4Var.c();
            }
            cVar.f521477e.mo152xb9724478();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(cVar.f521478f, "type " + cVar.f521473a + " productID " + cVar.f521474b + " fail errType " + fVar.f152148a + " errCode " + fVar.f152149b + " errMsg " + fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
