package cx;

/* loaded from: classes7.dex */
public abstract class w0 extends hq0.i0 {
    public final java.util.HashMap A;
    public yz5.a B;
    public boolean C;
    public final cx.p0 D;

    /* renamed from: x, reason: collision with root package name */
    public final ax.t f306012x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f306013y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.ref.WeakReference f306014z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ax.t flutterPlugin) {
        super(null, 1, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flutterPlugin, "flutterPlugin");
        this.f306012x = flutterPlugin;
        this.f306013y = new java.util.concurrent.CopyOnWriteArrayList();
        this.A = new java.util.HashMap(2);
        flutterPlugin.f96492r = new java.lang.ref.WeakReference(this);
        ((ku5.t0) ku5.t0.f394148d).q(new cx.h0(this));
        this.D = new cx.p0(this);
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.lang.ref.WeakReference weakReference = this.f306014z;
        if (weakReference != null) {
            return (android.app.Activity) weakReference.get();
        }
        return null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return new cx.o0(this);
    }

    @Override // hq0.i0
    public void G1(java.lang.String key, java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        super.G1(key, value);
    }

    @Override // hq0.i0
    public void I1(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b buildConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buildConfig, "buildConfig");
        buildConfig.f229365v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        buildConfig.a(kz5.p1.d(new sp0.g(), new sp0.e(), new sp0.f()));
        super.I1(buildConfig);
    }

    public void J1(java.lang.String testJs, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(testJs, "testJs");
        if (!z65.c.a()) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrandBaseBiz", "hy: not permitted env to eval test js!!!");
            if (lVar != null) {
                lVar.mo146xb9724478(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d);
                return;
            }
            return;
        }
        jc3.j0 j0Var = this.f364528g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        synchronized (j0Var) {
            if (this.f364530i) {
                jc3.j0 j0Var2 = this.f364528g;
                if (j0Var2 != null) {
                    ((rc3.w0) j0Var2).l(testJs, lVar);
                }
            } else {
                this.f306013y.add(new cx.j0(testJs, lVar));
            }
        }
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        hq0.e0 H0 = H0(this, context, O0(), "frames", "", true);
        ax.t tVar = this.f306012x;
        tVar.getClass();
        tVar.f323822e.put(H0.f364517e, H0);
        this.A.put("frames", H0);
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        java.lang.ref.WeakReference weakReference;
        android.app.Activity activity;
        this.f364531m.f364561a.clear();
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6 c4678x1d1a4af6 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495;
        boolean mo40975xf7b3660d = c4678x1d1a4af6.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrandBaseBiz", "onConnException foreground: " + mo40975xf7b3660d + ", bizName:" + O0());
        super.b1();
        if (z65.c.a() && (weakReference = this.f306014z) != null && (activity = (android.app.Activity) weakReference.get()) != null) {
            pm0.v.X(new cx.t0(activity));
        }
        if (!mo40975xf7b3660d) {
            cx.p0 p0Var = this.D;
            c4678x1d1a4af6.mo40976xa01141ab(p0Var);
            c4678x1d1a4af6.mo40973x40b15f2e(p0Var);
        } else {
            ((je3.i) i95.n0.c(je3.i.class)).Sc("MagicBrandDisconnectWhenAttach", 1, O0(), 1.0f);
            yz5.a aVar = this.B;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }

    @Override // hq0.i0
    /* renamed from: destroy */
    public void mo123041x5cd39ffa() {
        java.lang.String str;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MagicBrandBaseBiz", "destroy", new java.lang.Object[0]);
        ax.t tVar = this.f306012x;
        tVar.getClass();
        d75.b.g(new dq0.v(tVar));
        java.util.HashMap hashMap = this.A;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            hq0.e0 e0Var = (hq0.e0) ((java.util.Map.Entry) it.next()).getValue();
            if (e0Var != null && (str = e0Var.f364517e) != null) {
                tVar.i(str);
            }
        }
        hashMap.clear();
        super.mo123041x5cd39ffa();
        if (z65.c.a()) {
            this.f306013y.clear();
        }
    }

    @Override // hq0.i0
    public boolean g1() {
        java.lang.ref.WeakReference weakReference = this.f306014z;
        if (weakReference != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(weakReference);
            if (weakReference.get() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        jc3.j0 j0Var;
        if (z65.c.a() && (j0Var = this.f364528g) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            synchronized (j0Var) {
                for (cx.j0 j0Var2 : this.f306013y) {
                    jc3.j0 j0Var3 = this.f364528g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var3);
                    ((rc3.w0) j0Var3).l(j0Var2.f305952a, j0Var2.f305953b);
                }
            }
        }
        super.n();
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onCreated */
    public void mo123042x8cf48009() {
        super.mo123042x8cf48009();
    }

    @Override // hq0.i0
    public void w1(hq0.e0 root) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        super.w1(root);
        java.util.concurrent.CopyOnWriteArrayList<hq0.f0> copyOnWriteArrayList = this.f364529h;
        if (!copyOnWriteArrayList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList, 10));
            for (hq0.f0 f0Var : copyOnWriteArrayList) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(f0Var.f364522a);
                sb6.append('|');
                java.lang.String str = f0Var.f364523b;
                int length = str.length();
                if (length > 50) {
                    length = 50;
                }
                java.lang.String substring = str.substring(0, length);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                sb6.append(substring);
                arrayList.add(sb6.toString());
            }
            java.util.List S0 = kz5.n0.S0(arrayList);
            mq0.d1 d1Var = mq0.d1.f412079a;
            java.lang.String bizName = O0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
            cl0.e eVar = new cl0.e();
            java.util.Iterator it = S0.iterator();
            while (it.hasNext()) {
                eVar.q((java.lang.String) it.next());
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("bizName", bizName);
            jSONObject.put("event", S0);
            i95.m c17 = i95.n0.c(je3.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            je3.i.x2((je3.i) c17, "MagicBrandNotSendPendingEvents", 0, r26.i0.u(jSONObject2, ',', ';', false, 4, null), 0.0f, 8, null);
        }
    }
}
