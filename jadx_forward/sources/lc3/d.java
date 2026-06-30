package lc3;

/* loaded from: classes7.dex */
public final class d extends lc3.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetFileDescriptor f399426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetFileDescriptor, "assetFileDescriptor");
        this.f399426a = assetFileDescriptor;
    }

    /* renamed from: equals */
    public boolean m145567xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399426a, ((lc3.d) obj).f399426a);
    }

    /* renamed from: hashCode */
    public int m145568x8cdac1b() {
        return this.f399426a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145569x9616526c() {
        return "MBAssetFileScriptDescriptor(assetFileDescriptor=" + this.f399426a + ')';
    }
}
