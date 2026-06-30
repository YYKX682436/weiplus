package com.tencent.mm.mj_template.sns.backgroundwork;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/mj_template/sns/backgroundwork/TemplateBackgroundWork;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "hz0/d", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TemplateBackgroundWork extends androidx.work.CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemplateBackgroundWork(android.content.Context context, androidx.work.WorkerParameters workerParameters) {
        super(context, workerParameters);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(workerParameters, "workerParameters");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork r30, int r31, int r32, java.lang.String r33, com.tencent.maas.export.MJExportManager r34) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork.i(com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork, int, int, java.lang.String, com.tencent.maas.export.MJExportManager):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof hz0.g
            if (r0 == 0) goto L13
            r0 = r6
            hz0.g r0 = (hz0.g) r0
            int r1 = r0.f286261f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286261f = r1
            goto L18
        L13:
            hz0.g r0 = new hz0.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f286259d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f286261f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310570c
            hz0.i r2 = new hz0.i
            r4 = 0
            r2.<init>(r5, r4)
            r0.f286261f = r3
            java.lang.Object r6 = kotlinx.coroutines.l.g(r6, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.o.f(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_template.sns.backgroundwork.TemplateBackgroundWork.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final jz5.l j(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TemplateBackgroundWork", "before start work, workTagId is 0");
            return new jz5.l(java.lang.Boolean.FALSE, null);
        }
        dm.ib d17 = iz0.d.f296044a.d(str);
        if (d17 != null) {
            return new jz5.l(java.lang.Boolean.TRUE, d17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.TemplateBackgroundWork", "no find work in db >> ".concat(str));
        return new jz5.l(java.lang.Boolean.FALSE, null);
    }
}
