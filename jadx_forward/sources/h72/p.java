package h72;

/* loaded from: classes10.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f360988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h72.s f360989e;

    public p(h72.s sVar, byte[] bArr) {
        this.f360989e = sVar;
        this.f360988d = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544 interfaceC10689xe9fde544 = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class);
        h72.s sVar = this.f360989e;
        int i17 = sVar.f361009j;
        int i18 = sVar.f361010k;
        byte[] bArr = this.f360988d;
        interfaceC10689xe9fde544.mo10229x53f0f18e(bArr, i17, i18, false);
        if (sVar.f361000a.mo127745x89bef366() != null) {
            sVar.f361000a.mo127745x89bef366().a(bArr);
        }
    }
}
