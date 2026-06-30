package kj5;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj5.f f389992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kj5.f fVar) {
        super(0);
        this.f389992d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kj5.f fVar = this.f389992d;
        if (fVar.f389994q == 0) {
            fVar.T6().q().setVisibility(8);
            fVar.T6().p().setVisibility(0);
            fVar.T6().r().setTextColor(fVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a4h));
            fVar.T6().r().setText(com.p314xaae8f345.mm.R.C30867xcad56011.igk);
            fVar.T6().n().setBackground(fVar.m158354x19263085().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ayn));
        } else {
            fVar.T6().q().setVisibility(0);
            fVar.T6().p().setVisibility(8);
            fVar.T6().r().setTextColor(fVar.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
            fVar.T6().r().setText(fVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igt, java.lang.String.valueOf(fVar.f389994q)));
            fVar.T6().n().setBackground(fVar.m158354x19263085().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.ayo));
        }
        return jz5.f0.f384359a;
    }
}
