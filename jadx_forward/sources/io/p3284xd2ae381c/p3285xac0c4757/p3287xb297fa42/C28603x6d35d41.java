package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.WxaFlutterEngineGroup */
/* loaded from: classes11.dex */
public class C28603x6d35d41 {

    /* renamed from: activeEngines */
    final java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e> f71005x5a1a948b;

    public C28603x6d35d41(android.content.Context context) {
        this(context, null);
    }

    /* renamed from: createAndRunDefaultEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137843x8fcbd473(android.content.Context context) {
        return m137844xf6bf6fb2(context, null);
    }

    /* renamed from: createAndRunEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137844xf6bf6fb2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint) {
        return m137845xf6bf6fb2(context, dartEntrypoint, null);
    }

    /* renamed from: createEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137846x434cda5e(android.content.Context context) {
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e(context, new java.lang.String[0]);
    }

    public C28603x6d35d41(android.content.Context context, java.lang.String[] strArr) {
        this.f71005x5a1a948b = new java.util.ArrayList();
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f m136951x464ccf4f = io.p3284xd2ae381c.C28534x4dc80f50.m136946x21169495().m136951x464ccf4f();
        if (m136951x464ccf4f.m137937x498da6d4()) {
            return;
        }
        m136951x464ccf4f.m137938x6fa2b5a2(context.getApplicationContext());
        m136951x464ccf4f.m137931xa072d3d7(context, strArr);
    }

    /* renamed from: createAndRunEngine */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137845xf6bf6fb2(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint, java.lang.String str) {
        final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e m137460x688f37b;
        if (dartEntrypoint == null) {
            dartEntrypoint = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint.m137871xe1faf9a5();
        }
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint dartEntrypoint2 = dartEntrypoint;
        if (this.f71005x5a1a948b.size() == 0) {
            m137460x688f37b = m137846x434cda5e(context);
            if (str != null) {
                m137460x688f37b.m137435x8a0ad399().m138193x7e19e2e7(str);
            }
        } else {
            m137460x688f37b = this.f71005x5a1a948b.get(0).m137460x688f37b(context, dartEntrypoint2, str, null, null, false, false);
        }
        this.f71005x5a1a948b.add(m137460x688f37b);
        m137460x688f37b.m137415x4aac123b(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.WxaFlutterEngineGroup.1
            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onEngineWillDestroy */
            public void mo9535x8a6a5407() {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28603x6d35d41.this.f71005x5a1a948b.remove(m137460x688f37b);
            }

            @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e.EngineLifecycleListener
            /* renamed from: onPreEngineRestart */
            public void mo9536x89b45f89() {
            }
        });
        return m137460x688f37b;
    }
}
