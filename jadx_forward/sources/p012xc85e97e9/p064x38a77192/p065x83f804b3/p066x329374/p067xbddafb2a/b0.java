package p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a;

/* loaded from: classes5.dex */
public final class b0 implements p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f91924a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f91925b;

    /* renamed from: c, reason: collision with root package name */
    public int f91926c;

    public b0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f91924a = arrayList;
        this.f91925b = arrayList;
    }

    public final void a(int i17, java.lang.Object obj) {
        if (i17 == 0) {
            return;
        }
        p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c cVar = new p012xc85e97e9.p064x38a77192.p065x83f804b3.p066x329374.p067xbddafb2a.c(this.f91926c, i17, obj);
        this.f91926c += i17;
        ((java.util.ArrayList) this.f91924a).add(cVar);
    }
}
