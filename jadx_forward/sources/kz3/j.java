package kz3;

/* loaded from: classes15.dex */
public final class j implements db5.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kz3.l f395413a;

    public j(kz3.l lVar) {
        this.f395413a = lVar;
    }

    public void a(float f17, float f18) {
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(f18);
        if (valueOf == null || valueOf2 == null) {
            return;
        }
        kz3.w wVar = this.f395413a.f395427l;
        valueOf.floatValue();
        float floatValue = valueOf2.floatValue();
        if (wVar.f395465b == null) {
            return;
        }
        wVar.d();
        kz3.s sVar = wVar.f395473j;
        float f19 = sVar.f395460b;
        sy3.a aVar = wVar.f395465b;
        if (aVar != null) {
            aVar.c();
        }
        wVar.a();
        wVar.a();
        float f27 = wVar.f395469f;
        float f28 = floatValue - f27;
        float f29 = wVar.f395471h;
        if (f28 > f29) {
            wVar.f395469f = floatValue;
            if (wVar.f395470g != 1) {
                wVar.f395470g = 1;
                kz3.m mVar = wVar.f395466c;
                if (mVar != null) {
                    ((kz3.n) mVar).a(wVar.a() ? 1 : 2);
                }
            }
        } else if (f27 - floatValue > f29) {
            wVar.f395469f = floatValue;
            if (wVar.f395470g != 2) {
                wVar.f395470g = 2;
                kz3.m mVar2 = wVar.f395466c;
                if (mVar2 != null) {
                    ((kz3.n) mVar2).b(wVar.a() ? 1 : 2);
                }
            }
        }
        if (sVar.f395459a && java.lang.Math.abs(sVar.f395460b - floatValue) <= 0.001d) {
            sVar.f395459a = false;
            wVar.f395470g = 0;
        }
        sy3.a aVar2 = wVar.f395465b;
        float c17 = aVar2 != null ? aVar2.c() : 1.0f;
        kz3.u uVar = new kz3.u(wVar);
        kz3.v vVar = new kz3.v(wVar);
        kz3.q qVar = wVar.f395467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        if (!qVar.f395456a) {
            if (floatValue - c17 > wVar.f395472i) {
                uVar.mo152xb9724478();
                return;
            } else {
                vVar.mo152xb9724478();
                return;
            }
        }
        kz3.q qVar2 = wVar.f395467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar2);
        if (floatValue - qVar2.f395458c > wVar.f395472i) {
            uVar.mo152xb9724478();
            return;
        }
        kz3.q qVar3 = wVar.f395467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar3);
        if (floatValue - qVar3.f395457b > wVar.f395472i) {
            uVar.mo152xb9724478();
        } else {
            vVar.mo152xb9724478();
        }
    }
}
