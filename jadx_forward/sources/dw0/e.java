package dw0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f325626a;

    /* renamed from: b, reason: collision with root package name */
    public final int f325627b;

    public e(int i17, int i18) {
        this.f325626a = i17;
        this.f325627b = i18;
    }

    /* renamed from: equals */
    public boolean m126322xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw0.e)) {
            return false;
        }
        dw0.e eVar = (dw0.e) obj;
        return this.f325626a == eVar.f325626a && this.f325627b == eVar.f325627b;
    }

    /* renamed from: hashCode */
    public int m126323x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f325626a) * 31) + java.lang.Integer.hashCode(this.f325627b);
    }

    /* renamed from: toString */
    public java.lang.String m126324x9616526c() {
        return "TimbreSelectedPack(preIndex=" + this.f325626a + ", selectedIndex=" + this.f325627b + ')';
    }
}
