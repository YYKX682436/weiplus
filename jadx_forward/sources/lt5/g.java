package lt5;

/* loaded from: classes8.dex */
public abstract class g implements lt5.a {
    @Override // lt5.a
    public lt5.f a(android.content.Context context) {
        mt5.k kVar = (mt5.k) this;
        if (!"0".equals(kVar.b(context, "supported"))) {
            return lt5.f.a(-10);
        }
        java.lang.String b17 = kVar.b(context, "oaid");
        return android.text.TextUtils.isEmpty(b17) ? lt5.f.a(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a) : new lt5.f(b17, 0);
    }
}
