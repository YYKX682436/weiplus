package vi1;

/* loaded from: classes.dex */
public final class e1 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f518828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518830c;

    public e1(com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8, java.lang.String str, java.lang.String str2) {
        this.f518828a = viewOnClickListenerC22631x1cc07cc8;
        this.f518829b = str;
        this.f518830c = str2;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PhoneNumberAddView", "onStatusChange, isChecked: " + z17);
        this.f518828a.setContentDescription(z17 ? this.f518829b : this.f518830c);
    }
}
