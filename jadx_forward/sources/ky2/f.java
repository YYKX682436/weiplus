package ky2;

/* loaded from: classes.dex */
public final class f implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f395063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f395064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f395066d;

    public f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, android.widget.TextView textView, ky2.w wVar, int i17) {
        this.f395063a = c0Var;
        this.f395064b = textView;
        this.f395065c = wVar;
        this.f395066d = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f395063a;
        c0Var.d();
        ky2.w wVar = this.f395065c;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
            this.f395064b.setText(charSequence);
            ((ky2.r) wVar.f395118e.get(this.f395066d)).f395109b.f395112b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(charSequence.subSequence(0, charSequence.length() - 2).toString(), 0);
        }
        wVar.f395125o = c0Var.b();
    }
}
