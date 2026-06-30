package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.FlutterEngineGroup */
/* loaded from: classes11.dex */
public class C28584x3d6c67c1 {

    /* renamed from: activeEngines */
    final java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e> f70845x5a1a948b;

    /* renamed from: isShareIsolateMode */
    private boolean f70846x79cd84d9;

    /* renamed from: rootEngine */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f70847x9152b5c4;

    /* renamed from: io.flutter.embedding.engine.FlutterEngineGroup$Options */
    /* loaded from: classes11.dex */
    public static class Options {

        /* renamed from: context */
        private android.content.Context f70851x38b735af;

        /* renamed from: dartEntrypoint */
        private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint f70852x819f7d3d;

        /* renamed from: dartEntrypointArgs */
        private java.util.List<java.lang.String> f70853x7f13dbba;

        /* renamed from: initialRoute */
        private java.lang.String f70854xe6de5565;

        /* renamed from: platformViewsController */
        private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 f70855x15cba3b7;

        /* renamed from: automaticallyRegisterPlugins */
        private boolean f70850xd546f15a = true;

        /* renamed from: waitForRestorationData */
        private boolean f70856x41324fb4 = false;

        public Options(android.content.Context context) {
            this.f70851x38b735af = context;
        }

        /* renamed from: getAutomaticallyRegisterPlugins */
        public boolean m137539x2121d7d0() {
            return this.f70850xd546f15a;
        }

        /* renamed from: getContext */
        public android.content.Context m137540x76847179() {
            return this.f70851x38b735af;
        }

        /* renamed from: getDartEntrypoint */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint m137541x70374a33() {
            return this.f70852x819f7d3d;
        }

        /* renamed from: getDartEntrypointArgs */
        public java.util.List<java.lang.String> m137542x92703db0() {
            return this.f70853x7f13dbba;
        }

        /* renamed from: getInitialRoute */
        public java.lang.String m137543x47d0e7db() {
            return this.f70854xe6de5565;
        }

        /* renamed from: getPlatformViewsController */
        public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 m137544xe5cc0b81() {
            return this.f70855x15cba3b7;
        }

        /* renamed from: getWaitForRestorationData */
        public boolean m137545xab00c6aa() {
            return this.f70856x41324fb4;
        }

        /* renamed from: setAutomaticallyRegisterPlugins */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options m137546x1c0b3adc(boolean z17) {
            this.f70850xd546f15a = z17;
            return this;
        }

        /* renamed from: setDartEntrypoint */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options m137547x382db23f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint) {
            this.f70852x819f7d3d = dartEntrypoint;
            return this;
        }

        /* renamed from: setDartEntrypointArgs */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options m137548x299bbfbc(java.util.List<java.lang.String> list) {
            this.f70853x7f13dbba = list;
            return this;
        }

        /* renamed from: setInitialRoute */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options m137549x7e19e2e7(java.lang.String str) {
            this.f70854xe6de5565 = str;
            return this;
        }

        /* renamed from: setPlatformViewsController */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options m137550xfbfbf0f5(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97) {
            this.f70855x15cba3b7 = c28724xcf987b97;
            return this;
        }

        /* renamed from: setWaitForRestorationData */
        public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options m137551xdd4462b6(boolean z17) {
            this.f70856x41324fb4 = z17;
            return this;
        }
    }

    public C28584x3d6c67c1(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: createFlutterShellArgs */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 m137532xa1d5bf8d(java.lang.String[] strArr, boolean z17) {
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691(strArr);
    }

    /* renamed from: createAndRunDefaultEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137533x8fcbd473(android.content.Context context) {
        return m137534xf6bf6fb2(context, null);
    }

    /* renamed from: createAndRunEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137534xf6bf6fb2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint) {
        return m137535xf6bf6fb2(context, dartEntrypoint, null);
    }

    /* renamed from: createEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137538x434cda5e(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97, boolean z17, boolean z18, java.lang.String str) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e(context, null, null, c28724xcf987b97, null, z17, z18, str, this);
    }

    public C28584x3d6c67c1(android.content.Context context, java.lang.String[] strArr) {
        this(context, strArr, false);
    }

    /* renamed from: createAndRunEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137535xf6bf6fb2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.lang.String str) {
        return m137536xf6bf6fb2(context, dartEntrypoint, str, true);
    }

    public C28584x3d6c67c1(android.content.Context context, java.lang.String[] strArr, boolean z17) {
        this.f70845x5a1a948b = new java.util.ArrayList();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f m136951x464ccf4f = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136951x464ccf4f();
        this.f70846x79cd84d9 = z17;
        if (m136951x464ccf4f.m137937x498da6d4()) {
            return;
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28590xca799691 m137532xa1d5bf8d = m137532xa1d5bf8d(strArr, z17);
        m136951x464ccf4f.m137938x6fa2b5a2(context.getApplicationContext());
        m136951x464ccf4f.m137931xa072d3d7(context.getApplicationContext(), m137532xa1d5bf8d.m137777xb986489e());
    }

    /* renamed from: createAndRunEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137536xf6bf6fb2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.lang.String str, boolean z17) {
        return m137537xf6bf6fb2(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options(context).m137547x382db23f(dartEntrypoint).m137549x7e19e2e7(str).m137546x1c0b3adc(z17));
    }

    /* renamed from: createAndRunEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137537xf6bf6fb2(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.Options options) {
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137460x688f37b;
        android.content.Context m137540x76847179 = options.m137540x76847179();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint m137541x70374a33 = options.m137541x70374a33();
        java.lang.String m137543x47d0e7db = options.m137543x47d0e7db();
        java.util.List<java.lang.String> m137542x92703db0 = options.m137542x92703db0();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 m137544xe5cc0b81 = options.m137544xe5cc0b81();
        if (m137544xe5cc0b81 == null) {
            m137544xe5cc0b81 = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97();
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28724xcf987b97 c28724xcf987b97 = m137544xe5cc0b81;
        boolean m137539x2121d7d0 = options.m137539x2121d7d0();
        boolean m137545xab00c6aa = options.m137545xab00c6aa();
        if (m137541x70374a33 == null) {
            m137541x70374a33 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint.m137871xe1faf9a5();
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint = m137541x70374a33;
        if (this.f70845x5a1a948b.size() == 0) {
            m137460x688f37b = m137538x434cda5e(m137540x76847179, c28724xcf987b97, m137539x2121d7d0, m137545xab00c6aa, m137543x47d0e7db);
            if (m137543x47d0e7db != null) {
                m137460x688f37b.m137435x8a0ad399().m138193x7e19e2e7(m137543x47d0e7db);
            }
            m137460x688f37b.m137427x4255efe8().m137854x820a9012(dartEntrypoint, m137542x92703db0);
            this.f70847x9152b5c4 = m137460x688f37b;
        } else {
            m137460x688f37b = this.f70845x5a1a948b.get(0).m137460x688f37b(m137540x76847179, dartEntrypoint, m137543x47d0e7db, m137542x92703db0, c28724xcf987b97, m137539x2121d7d0, m137545xab00c6aa);
        }
        this.f70845x5a1a948b.add(m137460x688f37b);
        m137460x688f37b.m137415x4aac123b(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngineGroup.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onEngineWillDestroy */
            public void mo9535x8a6a5407() {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.this.f70845x5a1a948b.remove(m137460x688f37b);
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.this.f70845x5a1a948b.size() == 0) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1.this.f70847x9152b5c4 = null;
                }
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onPreEngineRestart */
            public void mo9536x89b45f89() {
            }
        });
        return m137460x688f37b;
    }
}
