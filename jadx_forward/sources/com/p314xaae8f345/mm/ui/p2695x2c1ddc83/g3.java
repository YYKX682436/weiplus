package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class g3 implements hh4.a {

    /* renamed from: a, reason: collision with root package name */
    public float f289222a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public long f289223b = 4294967296L;

    /* renamed from: c, reason: collision with root package name */
    public int f289224c = -1;

    /* renamed from: d, reason: collision with root package name */
    public float f289225d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public long f289226e = 4294967296L;

    /* renamed from: f, reason: collision with root package name */
    public long f289227f = 4294967296L;

    /* renamed from: g, reason: collision with root package name */
    public int f289228g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hh4.a f289229h;

    public g3(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ViewOnTouchListenerC22366xcd5c2226 viewOnTouchListenerC22366xcd5c2226, hh4.a aVar) {
        this.f289229h = aVar;
    }

    @Override // hh4.a
    public void a(float f17, int i17, int i18) {
        hh4.a aVar = this.f289229h;
        if (aVar != null) {
            if (java.lang.Float.compare(this.f289222a, f17) == 0 && this.f289223b == i17 && this.f289224c == i18) {
                return;
            }
            aVar.a(f17, i17, i18);
            this.f289222a = f17;
            this.f289223b = i17;
            this.f289224c = i18;
        }
    }

    @Override // hh4.a
    public void b(boolean z17) {
        hh4.a aVar = this.f289229h;
        if (aVar != null) {
            int i17 = this.f289228g;
            if (i17 != -1) {
                if ((i17 == 1) == z17) {
                    return;
                }
            }
            aVar.b(z17);
            this.f289228g = z17 ? 1 : 0;
        }
    }

    @Override // hh4.a
    public void c(float f17, int i17, int i18) {
        hh4.a aVar = this.f289229h;
        if (aVar != null) {
            if (java.lang.Float.compare(this.f289225d, f17) == 0 && this.f289226e == i17 && this.f289227f == i18) {
                return;
            }
            aVar.c(f17, i17, i18);
            this.f289225d = f17;
            this.f289226e = i17;
            this.f289227f = i18;
        }
    }
}
