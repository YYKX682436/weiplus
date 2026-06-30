package rx2;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spannable f482531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.text.Spannable spannable) {
        super(2);
        this.f482531d = spannable;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        this.f482531d.setSpan(new android.text.style.ForegroundColorSpan(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo)), intValue, intValue2, 17);
        return jz5.f0.f384359a;
    }
}
