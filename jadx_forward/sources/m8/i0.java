package m8;

/* loaded from: classes15.dex */
public class i0 implements m8.i {

    /* renamed from: a, reason: collision with root package name */
    public final m8.b0[] f406093a;

    /* renamed from: b, reason: collision with root package name */
    public final m8.i f406094b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f406095c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f406096d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f406097e;

    /* renamed from: f, reason: collision with root package name */
    public final int f406098f;

    /* renamed from: g, reason: collision with root package name */
    public final int f406099g;

    /* renamed from: h, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f406100h;

    /* renamed from: i, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417 f406101i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.Surface f406102j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f406103k;

    /* renamed from: l, reason: collision with root package name */
    public float f406104l;

    public i0(m8.e0 e0Var, q9.o oVar, m8.u uVar) {
        m8.g0 g0Var = new m8.g0(this, null);
        this.f406095c = new java.util.concurrent.CopyOnWriteArraySet();
        this.f406096d = new java.util.concurrent.CopyOnWriteArraySet();
        this.f406097e = new java.util.concurrent.CopyOnWriteArraySet();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper() != null ? android.os.Looper.myLooper() : android.os.Looper.getMainLooper());
        m8.d dVar = (m8.d) e0Var;
        dVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.content.Context context = dVar.f406085a;
        y8.e eVar = y8.e.f541346a;
        arrayList.add(new u9.i(context, eVar, 5000L, null, false, handler, g0Var, 50));
        arrayList.add(new n8.b0(eVar, null, true, handler, g0Var, n8.d.a(dVar.f406085a), new n8.f[0]));
        arrayList.add(new i9.l(g0Var, handler.getLooper()));
        arrayList.add(new z8.g(g0Var, handler.getLooper()));
        m8.b0[] b0VarArr = (m8.b0[]) arrayList.toArray(new m8.b0[arrayList.size()]);
        this.f406093a = b0VarArr;
        int i17 = 0;
        int i18 = 0;
        for (m8.b0 b0Var : b0VarArr) {
            int i19 = ((m8.a) b0Var).f406068d;
            if (i19 == 1) {
                i18++;
            } else if (i19 == 2) {
                i17++;
            }
        }
        this.f406098f = i17;
        this.f406099g = i18;
        this.f406104l = 1.0f;
        this.f406094b = new m8.k(this.f406093a, oVar, uVar);
    }

    @Override // m8.a0
    public void a(m8.y yVar) {
        ((m8.k) this.f406094b).a(yVar);
    }

    @Override // m8.i
    public void b(m8.h... hVarArr) {
        ((m8.k) this.f406094b).b(hVarArr);
    }

    @Override // m8.a0
    public boolean c() {
        return ((m8.k) this.f406094b).f406114i;
    }

    @Override // m8.a0
    public void d(m8.z zVar) {
        ((m8.k) this.f406094b).d(zVar);
    }

    @Override // m8.a0
    public void e(boolean z17) {
        ((m8.k) this.f406094b).e(z17);
    }

    @Override // m8.i
    public void f(m8.h... hVarArr) {
        ((m8.k) this.f406094b).f(hVarArr);
    }

    public void g(m8.z zVar) {
        ((m8.k) this.f406094b).f406110e.add(zVar);
    }

    @Override // m8.a0
    /* renamed from: getCurrentPosition */
    public long mo146925x9746038c() {
        return ((m8.k) this.f406094b).mo146925x9746038c();
    }

    @Override // m8.a0
    /* renamed from: getDuration */
    public long mo146926x51e8b0a() {
        return ((m8.k) this.f406094b).mo146926x51e8b0a();
    }

    public int h() {
        return ((m8.k) this.f406094b).g();
    }

    public final void i() {
    }

    public void j(int i17) {
        int i18 = t9.d0.f498031a;
        int i19 = 4;
        int i27 = i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 5 ? i17 != 8 ? 1 : 3 : 5 : 4 : 6 : 13 : 2;
        if (i17 == 0) {
            i19 = 1;
        } else if (i17 != 1 && i17 != 2 && i17 != 4 && i17 != 5 && i17 != 8) {
            i19 = 2;
        }
        n8.c cVar = new n8.c(i19, 0, i27, null);
        m8.h[] hVarArr = new m8.h[this.f406099g];
        int i28 = 0;
        for (m8.b0 b0Var : this.f406093a) {
            if (((m8.a) b0Var).f406068d == 1) {
                hVarArr[i28] = new m8.h(b0Var, 3, cVar);
                i28++;
            }
        }
        ((m8.k) this.f406094b).f(hVarArr);
    }

    public void k(int i17) {
        m8.k kVar = (m8.k) this.f406094b;
        if (kVar.f406115j != i17) {
            kVar.f406115j = i17;
            kVar.f406109d.f406182i.obtainMessage(12, i17, 0).sendToTarget();
            java.util.Iterator it = kVar.f406110e.iterator();
            while (it.hasNext()) {
                ((m8.z) it.next()).z(i17);
            }
        }
    }

    public final void l(android.view.Surface surface, boolean z17) {
        m8.h[] hVarArr = new m8.h[this.f406098f];
        int i17 = 0;
        for (m8.b0 b0Var : this.f406093a) {
            if (((m8.a) b0Var).f406068d == 2) {
                hVarArr[i17] = new m8.h(b0Var, 1, surface);
                i17++;
            }
        }
        android.view.Surface surface2 = this.f406102j;
        m8.i iVar = this.f406094b;
        if (surface2 == null || surface2 == surface) {
            ((m8.k) iVar).f(hVarArr);
        } else {
            ((m8.k) iVar).b(hVarArr);
            if (this.f406103k) {
                this.f406102j.release();
            }
        }
        this.f406102j = surface;
        this.f406103k = z17;
    }

    public void m(float f17) {
        this.f406104l = f17;
        m8.h[] hVarArr = new m8.h[this.f406099g];
        int i17 = 0;
        for (m8.b0 b0Var : this.f406093a) {
            if (((m8.a) b0Var).f406068d == 1) {
                hVarArr[i17] = new m8.h(b0Var, 2, java.lang.Float.valueOf(f17));
                i17++;
            }
        }
        ((m8.k) this.f406094b).f(hVarArr);
    }

    public void n() {
        ((m8.k) this.f406094b).f406109d.f406182i.sendEmptyMessage(5);
    }

    @Override // m8.a0
    /* renamed from: release */
    public void mo146927x41012807() {
        ((m8.k) this.f406094b).mo146927x41012807();
        i();
        android.view.Surface surface = this.f406102j;
        if (surface != null) {
            if (this.f406103k) {
                surface.release();
            }
            this.f406102j = null;
        }
    }

    @Override // m8.a0
    /* renamed from: seekTo */
    public void mo146928xc9fc1b13(long j17) {
        ((m8.k) this.f406094b).mo146928xc9fc1b13(j17);
    }

    @Override // m8.a0
    public int t() {
        return ((m8.k) this.f406094b).f406116k;
    }
}
