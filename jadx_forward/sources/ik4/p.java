package ik4;

/* loaded from: classes4.dex */
public final class p implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, ik4.r {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f373489d;

    /* renamed from: e, reason: collision with root package name */
    public ik4.g f373490e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f373491f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f373492g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f373493h;

    /* renamed from: i, reason: collision with root package name */
    public int f373494i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f373495m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f373496n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f373497o;

    /* renamed from: p, reason: collision with root package name */
    public fk4.u f373498p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f373499q;

    public p(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f373489d = context;
        this.f373493h = true;
        this.f373495m = "";
        this.f373497o = "";
        this.f373499q = true;
    }

    @Override // ik4.r
    public void a(android.view.Surface surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        f("onSurfaceDestroyed");
    }

    @Override // ik4.r
    public void b(android.view.Surface surface, int i17, int i18, int i19) {
        android.view.Surface surface2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373491f, surface) && (surface2 = this.f373491f) != null) {
            surface2.release();
        }
        this.f373491f = surface;
        ik4.g gVar = this.f373490e;
        if (gVar != null) {
            gVar.mo100965xd0747cbc(this.f373492g);
        }
        ik4.g gVar2 = this.f373490e;
        if (gVar2 != null) {
            int i27 = this.f373494i;
            if (d()) {
                gVar2.f390069l = surface;
                gVar2.f390070m = i27;
            }
            gVar2.mo100984x40944be2(surface, i27);
        }
        f("onSurfaceAvailable width:" + i17 + " height:" + i18 + " surfaceType:" + i19);
    }

    public final java.lang.String c() {
        if (!android.text.TextUtils.isEmpty(this.f373497o)) {
            return this.f373497o;
        }
        fk4.u uVar = this.f373498p;
        if (uVar != null) {
            return ((fk4.k) uVar).n();
        }
        return null;
    }

    public final boolean d() {
        java.lang.Object obj;
        ik4.l lVar = ik4.l.f373474a;
        ik4.g gVar = this.f373490e;
        if (gVar == null) {
            return false;
        }
        java.util.Set entrySet = ik4.l.f373477d.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.l) ((java.util.Map.Entry) obj).getValue()).f384367e, gVar)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return entry == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((jz5.l) entry.getValue()).f384366d, this);
    }

    public final void e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Flexible@" + hashCode(), "[" + this.f373495m + ']' + str);
    }

    public final void f(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Flexible@" + hashCode(), "[" + this.f373495m + ']' + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(boolean r11, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener r12, boolean r13, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ik4.p.g(boolean, com.tencent.thumbplayer.api.ITPPlayerListener$IOnInfoListener, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(kk4.c cVar, fk4.u uVar) {
        fk4.k kVar = (fk4.k) uVar;
        kk4.f0 f0Var = (kk4.f0) cVar;
        f0Var.mo100974xab2f6987(new com.p314xaae8f345.p3006xb8ff1437.api.C26204xf8de58ad.Builder().m101226xb4088fb7(kVar.f()).m101224x10a74e5(new com.p314xaae8f345.p3006xb8ff1437.api.p3017x65fca6e.C26231xafaedb13(11)).m101222x59bc66e());
        f0Var.mo100906x969bf12(new fk4.l(kVar));
        java.lang.String f17 = kVar.f();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        f0Var.d(f17, this.f373496n);
        f0Var.mo100945x683d6267("http://127.0.0.1:1234/mock_url");
    }

    public final boolean i(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            e("invalid media id");
            return false;
        }
        if (android.text.TextUtils.isEmpty(this.f373495m)) {
            this.f373495m = str;
            this.f373496n = str2;
            return true;
        }
        e("repeat set media id,id:" + this.f373495m + " to " + str);
        return false;
    }

    public final void j(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Integer num) {
        if (bool != null) {
            this.f373492g = bool.booleanValue();
            ik4.g gVar = this.f373490e;
            if (gVar != null) {
                gVar.mo100965xd0747cbc(bool.booleanValue());
            }
        }
        if (bool2 != null) {
            this.f373493h = bool2.booleanValue();
            ik4.g gVar2 = this.f373490e;
            if (gVar2 != null) {
                gVar2.mo100947xfd27780d(bool2.booleanValue());
            }
        }
        if (num == null || this.f373494i == num.intValue()) {
            return;
        }
        this.f373494i = num.intValue();
        ik4.g gVar3 = this.f373490e;
        if (gVar3 != null) {
            android.view.Surface surface = this.f373491f;
            int intValue = num.intValue();
            if (d()) {
                gVar3.f390069l = surface;
                gVar3.f390070m = intValue;
            }
            gVar3.mo100984x40944be2(surface, intValue);
        }
        f("[" + this.f373495m + "]updateConfig mute:" + bool + " playMode:" + num);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        f("onPrepared and trigger start1");
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ik4.n(this, interfaceC26164x73fc6bc6, null), 3, null);
    }
}
