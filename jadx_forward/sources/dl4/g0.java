package dl4;

/* loaded from: classes3.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ff0.z f316933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ff0.z zVar, android.view.View view) {
        super(0);
        this.f316933d = zVar;
        this.f316934e = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ff0.z zVar = this.f316933d;
        if (zVar != null) {
            int i17 = zVar.f343129b | (-16777216);
            boolean C = com.p314xaae8f345.mm.ui.bk.C();
            android.view.View view = this.f316934e;
            if (C) {
                if (view != null) {
                    view.setBackgroundColor(e3.b.c(i17, -16777216, 0.5f));
                }
            } else if (view != null) {
                view.setBackgroundColor(i17);
            }
        }
        return jz5.f0.f384359a;
    }
}
