package p012xc85e97e9.p096x62f6fe4;

/* renamed from: androidx.media.AudioAttributesImplApi21 */
/* loaded from: classes14.dex */
public class C1128x431106c implements p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioAttributes f93228a;

    /* renamed from: b, reason: collision with root package name */
    public int f93229b;

    public C1128x431106c() {
        this.f93229b = -1;
    }

    @Override // p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d
    public int a() {
        int i17 = this.f93229b;
        return i17 != -1 ? i17 : p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f.c(false, this.f93228a.getFlags(), this.f93228a.getUsage());
    }

    @Override // p012xc85e97e9.p096x62f6fe4.InterfaceC1127x5ca5bd6d
    public java.lang.Object b() {
        return this.f93228a;
    }

    /* renamed from: equals */
    public boolean m7875xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof p012xc85e97e9.p096x62f6fe4.C1128x431106c) {
            return this.f93228a.equals(((p012xc85e97e9.p096x62f6fe4.C1128x431106c) obj).f93228a);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m7876x8cdac1b() {
        return this.f93228a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m7877x9616526c() {
        return "AudioAttributesCompat: audioattributes=" + this.f93228a;
    }

    public C1128x431106c(android.media.AudioAttributes audioAttributes, int i17) {
        this.f93228a = audioAttributes;
        this.f93229b = i17;
    }
}
