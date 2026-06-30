package rf4;

/* loaded from: classes4.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 f476649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476650e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331, android.content.Context context) {
        super(1);
        this.f476649d = c18486xb54a9331;
        this.f476650e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gf4.a it = (gf4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18486xb54a9331 c18486xb54a9331 = this.f476649d;
        if (c18486xb54a9331.getCommentInputView().getInputType() != -1) {
            c18486xb54a9331.getCommentInputView().b();
        } else {
            java.lang.String e17 = ef4.w.f334001t.e();
            java.lang.String str = it.f352863a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(e17, str)) {
                int i17 = it.f352874l;
                android.content.Context context = this.f476650e;
                java.lang.String string = i17 == 0 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jln) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlo);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
                u1Var.g(string);
                u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
                u1Var.k(-65536);
                u1Var.a(true);
                u1Var.b(new rf4.u1(c18486xb54a9331, it));
                u1Var.q(false);
            } else {
                c18486xb54a9331.f253555t = str;
                c18486xb54a9331.f253557v = it.f352867e;
                c18486xb54a9331.commentInputView.d(c18486xb54a9331.f253560y, str, true);
                c18486xb54a9331.commentInputView.e(0, true);
            }
        }
        return jz5.f0.f384359a;
    }
}
