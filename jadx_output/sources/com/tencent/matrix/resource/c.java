package com.tencent.matrix.resource;

/* loaded from: classes13.dex */
public final class c extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.MatrixJobIntentService f52939a;

    public c(com.tencent.matrix.resource.MatrixJobIntentService matrixJobIntentService) {
        this.f52939a = matrixJobIntentService;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.tencent.matrix.resource.g gVar;
        while (true) {
            com.tencent.matrix.resource.MatrixJobIntentService matrixJobIntentService = this.f52939a;
            com.tencent.matrix.resource.d dVar = matrixJobIntentService.f52928d;
            if (dVar != null) {
                com.tencent.matrix.resource.i iVar = (com.tencent.matrix.resource.i) dVar;
                synchronized (iVar.f52951b) {
                    android.app.job.JobParameters jobParameters = iVar.f52952c;
                    if (jobParameters != null) {
                        try {
                            android.app.job.JobWorkItem dequeueWork = jobParameters.dequeueWork();
                            if (dequeueWork != null && dequeueWork.getIntent() != null) {
                                dequeueWork.getIntent().setExtrasClassLoader(iVar.f52950a.getClassLoader());
                                gVar = new com.tencent.matrix.resource.h(iVar, dequeueWork);
                            }
                        } catch (java.lang.Throwable th6) {
                            oj.j.d("JobServiceEngineImpl", th6, "exception occurred.", new java.lang.Object[0]);
                        }
                    }
                }
                gVar = null;
            } else {
                java.util.ArrayList arrayList = matrixJobIntentService.f52932h;
                if (arrayList != null) {
                    synchronized (arrayList) {
                        java.util.ArrayList arrayList2 = matrixJobIntentService.f52932h;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            gVar = (com.tencent.matrix.resource.g) matrixJobIntentService.f52932h.remove(0);
                        }
                    }
                }
                gVar = null;
            }
            if (gVar == null) {
                return null;
            }
            this.f52939a.d(gVar.getIntent());
            gVar.complete();
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled(java.lang.Object obj) {
        this.f52939a.e();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        this.f52939a.e();
    }
}
