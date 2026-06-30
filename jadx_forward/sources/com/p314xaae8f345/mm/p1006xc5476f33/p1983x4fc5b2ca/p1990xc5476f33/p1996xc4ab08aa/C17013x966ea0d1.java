package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitRecordViewLayout;", "Landroid/widget/FrameLayout;", "Lnr0/c;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/o;", "getLifecycle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout */
/* loaded from: classes10.dex */
public final class C17013x966ea0d1 extends android.widget.FrameLayout implements nr0.c, p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f237338d;

    /* renamed from: e, reason: collision with root package name */
    public final lu3.m f237339e;

    /* renamed from: f, reason: collision with root package name */
    public final bs0.j f237340f;

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f237341g;

    /* renamed from: h, reason: collision with root package name */
    public ju3.y f237342h;

    /* renamed from: i, reason: collision with root package name */
    public ju3.x f237343i;

    /* renamed from: m, reason: collision with root package name */
    public int f237344m;

    /* renamed from: n, reason: collision with root package name */
    public int f237345n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f237346o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f237347p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17013x966ea0d1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237338d = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        lu3.m mVar = new lu3.m(false, 1, null);
        this.f237339e = mVar;
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f237341g = a17;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dma, (android.view.ViewGroup) this, true);
        android.view.KeyEvent.Callback findViewById = findViewById(com.p314xaae8f345.mm.R.id.b5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        bs0.j jVar = (bs0.j) findViewById;
        this.f237340f = jVar;
        jVar.l0(this);
        jVar.mo9385xabce2de9(this);
        p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new ju3.v(this, null), 3, null);
        mVar.h(true);
    }

    @Override // nr0.c
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object a17 = this.f237339e.a(interfaceC29045xdcb5ca57);
        return a17 == pz5.a.f440719d ? a17 : jz5.f0.f384359a;
    }

    public final void b(ju3.x openCallback, ju3.y previewCallback, java.lang.String recordResultPath, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openCallback, "openCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewCallback, "previewCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordResultPath, "recordResultPath");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", hashCode() + " initCamera " + recordResultPath);
        this.f237343i = openCallback;
        this.f237342h = previewCallback;
        this.f237344m = i19;
        this.f237345n = 0;
        this.f237347p = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624();
        c16993xacc19624.A = com.p314xaae8f345.mm.vfs.w6.i(recordResultPath, true);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(1, 1).f230352f;
        c16993xacc19624.f237209n = c11120x15dce88d;
        c11120x15dce88d.f152724d = i17;
        c11120x15dce88d.f152725e = i18;
        c11120x15dce88d.f152727g = i27;
        c16993xacc19624.M.putInt("key_record_bitrate_ratio", i28);
        st3.t tVar = st3.t.f494130a;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParam = c16993xacc19624.f237209n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoParam, "videoParam");
        tVar.c(videoParam, 1, true);
        lu3.m mVar = this.f237339e;
        mVar.getClass();
        mVar.f402953p = c16993xacc19624;
        mVar.f402960w = mVar.c(true, new lu3.g(false, mVar, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "initCamera " + c16993xacc19624);
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "onCreate");
        try {
            this.f237338d.f(p012xc85e97e9.p093xedfae76a.m.ON_CREATE);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraKitRecordViewLayout", "onCreate error " + e17.getMessage());
        }
    }

    @Override // nr0.c
    public java.lang.Object d(is0.c cVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        byte[] array;
        ju3.y yVar;
        java.lang.System.currentTimeMillis();
        int i17 = this.f237345n;
        int i18 = this.f237344m;
        boolean z17 = this.f237347p;
        if (i17 % i18 == 0 && z17) {
            rs0.g gVar = rs0.i.f480829a;
            if (cVar == null) {
                array = null;
            } else {
                int i19 = cVar.f375928e;
                int i27 = cVar.f375933m;
                int i28 = cVar.f375934n;
                int[] iArr = new int[1];
                android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i19, 0);
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i27 * i28 * 4);
                android.opengl.GLES20.glReadPixels(0, 0, i27, i28, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLFormat.f5294x32ebd04e, com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.C1597xb11e7fbb.GLType.f5295x7a6b238, allocate);
                array = allocate.array();
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
            }
            if (array != null && (yVar = this.f237342h) != null) {
                yVar.a(array);
            }
        }
        this.f237345n++;
        return this.f237339e.d(cVar, interfaceC29045xdcb5ca57);
    }

    public final void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", hashCode() + " onDestroy");
        try {
            this.f237338d.f(p012xc85e97e9.p093xedfae76a.m.ON_DESTROY);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraKitRecordViewLayout", "onDestroy error " + e17.getMessage());
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f237341g, null, 1, null);
    }

    public final void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "onPause");
        this.f237347p = false;
        if (this.f237346o) {
            return;
        }
        try {
            this.f237346o = true;
            this.f237338d.f(p012xc85e97e9.p093xedfae76a.m.ON_PAUSE);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraKitRecordViewLayout", "onPause error " + e17.getMessage());
        }
    }

    @Override // nr0.c
    public java.lang.Object g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object g17 = this.f237339e.g(interfaceC29045xdcb5ca57);
        return g17 == pz5.a.f440719d ? g17 : jz5.f0.f384359a;
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f237338d;
    }

    public final void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "onResume");
        this.f237346o = false;
        try {
            this.f237338d.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CameraKitRecordViewLayout", "onResume error " + e17.getMessage());
        }
    }

    public final void i(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitRecordViewLayout", "startPreview " + i17);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f237340f.f0(context, new xr0.h(null, new xr0.c(0, 0, i17, null, null, true, 27, null), new xr0.g(-1, -1), new xr0.b(false, false, false, false, false, 7, null), 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ju3.w
            if (r0 == 0) goto L13
            r0 = r6
            ju3.w r0 = (ju3.w) r0
            int r1 = r0.f383564f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f383564f = r1
            goto L18
        L13:
            ju3.w r0 = new ju3.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f383562d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f383564f
            java.lang.String r3 = "MicroMsg.CameraKitRecordViewLayout"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.String r6 = "stopRecord"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r6)
            r0.f383564f = r4
            lu3.m r6 = r5.f237339e
            java.lang.Object r6 = r6.j(r4, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            jz5.l r6 = (jz5.l) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "stop result >> "
            r0.<init>(r1)
            java.lang.Object r1 = r6.f384366d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            jz5.l r0 = new jz5.l
            java.lang.Object r1 = r6.f384367e
            ct0.b r1 = (ct0.b) r1
            if (r1 == 0) goto L6c
            java.lang.String r1 = r1.f303737a
            goto L6d
        L6c:
            r1 = 0
        L6d:
            java.lang.Object r6 = r6.f384366d
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17013x966ea0d1.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17013x966ea0d1(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f237338d = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        lu3.m mVar = new lu3.m(false, 1, null);
        this.f237339e = mVar;
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f237341g = a17;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dma, (android.view.ViewGroup) this, true);
        android.view.KeyEvent.Callback findViewById = findViewById(com.p314xaae8f345.mm.R.id.b5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        bs0.j jVar = (bs0.j) findViewById;
        this.f237340f = jVar;
        jVar.l0(this);
        jVar.mo9385xabce2de9(this);
        p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new ju3.v(this, null), 3, null);
        mVar.h(true);
    }
}
