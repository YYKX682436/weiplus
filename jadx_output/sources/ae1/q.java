package ae1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class q {

    /* renamed from: e, reason: collision with root package name */
    public static final ae1.p f3404e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ae1.q[] f3405f;

    /* renamed from: d, reason: collision with root package name */
    public final com.tenpay.ndk.WxSmCryptoUtil.SM4Mode f3406d;

    static {
        ae1.q[] qVarArr = {new ae1.q("SM4_ECB", 0, 0, com.tenpay.ndk.WxSmCryptoUtil.SM4Mode.SM4_ECB)};
        f3405f = qVarArr;
        rz5.b.a(qVarArr);
        f3404e = new ae1.p(null);
    }

    public q(java.lang.String str, int i17, int i18, com.tenpay.ndk.WxSmCryptoUtil.SM4Mode sM4Mode) {
        this.f3406d = sM4Mode;
    }

    public static ae1.q valueOf(java.lang.String str) {
        return (ae1.q) java.lang.Enum.valueOf(ae1.q.class, str);
    }

    public static ae1.q[] values() {
        return (ae1.q[]) f3405f.clone();
    }
}
