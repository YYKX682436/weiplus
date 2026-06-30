package com.tencent.mm.app.plugin.worker;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/app/plugin/worker/DBDataCleanWorkManager;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "yk/o", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public class DBDataCleanWorkManager extends androidx.work.Worker {

    /* renamed from: o, reason: collision with root package name */
    public static java.util.List f53700o;

    /* renamed from: p, reason: collision with root package name */
    public static long f53701p;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f53705t;

    /* renamed from: m, reason: collision with root package name */
    public static final yk.o f53698m = new yk.o(null);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f53699n = jz5.h.b(yk.m.f462754d);

    /* renamed from: q, reason: collision with root package name */
    public static final jz5.g f53702q = jz5.h.b(yk.n.f462755d);

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f53703r = jz5.h.b(yk.k.f462752d);

    /* renamed from: s, reason: collision with root package name */
    public static final jz5.g f53704s = jz5.h.b(yk.l.f462753d);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBDataCleanWorkManager(android.content.Context context, androidx.work.WorkerParameters workerParams) {
        super(context, workerParams);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public a5.y h() {
        yk.o oVar = f53698m;
        android.content.Context context = this.f12458d;
        kotlin.jvm.internal.o.f(context, "getApplicationContext(...)");
        return oVar.b(context);
    }
}
