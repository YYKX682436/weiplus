package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public is0.c f231421a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.SurfaceTexture f231422b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.Surface f231423c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.HandlerThread f231424d;

    /* renamed from: e, reason: collision with root package name */
    public rs0.h f231425e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f231426f;

    /* renamed from: g, reason: collision with root package name */
    public int f231427g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f231428h = 1;

    /* renamed from: i, reason: collision with root package name */
    public os0.c f231429i;

    public final void a(final yz5.a task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        android.os.Handler handler = this.f231426f;
        if (handler != null) {
            handler.post(new java.lang.Runnable(task) { // from class: com.tencent.mm.plugin.multitalk.model.y2

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f231744d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "function");
                    this.f231744d = task;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f231744d.mo152xb9724478();
                }
            });
        }
    }
}
