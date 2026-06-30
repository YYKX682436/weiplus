package e46;

/* loaded from: classes16.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f330971a = new byte[65536];

    /* renamed from: b, reason: collision with root package name */
    public int f330972b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f330973c;

    public e(e46.b bVar) {
    }

    public byte a(byte b17) {
        int i17 = this.f330972b;
        this.f330971a[i17] = b17;
        int i18 = (i17 + 1) & 65535;
        if (!this.f330973c && i18 < i17) {
            this.f330973c = true;
        }
        this.f330972b = i18;
        return b17;
    }
}
