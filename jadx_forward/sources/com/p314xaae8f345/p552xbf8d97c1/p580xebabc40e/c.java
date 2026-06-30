package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes13.dex */
public final class c extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd f134472a;

    public c(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd abstractServiceC4704xa345f5bd) {
        this.f134472a = abstractServiceC4704xa345f5bd;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g gVar;
        while (true) {
            com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd abstractServiceC4704xa345f5bd = this.f134472a;
            com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.d dVar = abstractServiceC4704xa345f5bd.f134461d;
            if (dVar != null) {
                com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.i iVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.i) dVar;
                synchronized (iVar.f134484b) {
                    android.app.job.JobParameters jobParameters = iVar.f134485c;
                    if (jobParameters != null) {
                        try {
                            android.app.job.JobWorkItem dequeueWork = jobParameters.dequeueWork();
                            if (dequeueWork != null && dequeueWork.getIntent() != null) {
                                dequeueWork.getIntent().setExtrasClassLoader(iVar.f134483a.getClassLoader());
                                gVar = new com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.h(iVar, dequeueWork);
                            }
                        } catch (java.lang.Throwable th6) {
                            oj.j.d("JobServiceEngineImpl", th6, "exception occurred.", new java.lang.Object[0]);
                        }
                    }
                }
                gVar = null;
            } else {
                java.util.ArrayList arrayList = abstractServiceC4704xa345f5bd.f134465h;
                if (arrayList != null) {
                    synchronized (arrayList) {
                        java.util.ArrayList arrayList2 = abstractServiceC4704xa345f5bd.f134465h;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            gVar = (com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g) abstractServiceC4704xa345f5bd.f134465h.remove(0);
                        }
                    }
                }
                gVar = null;
            }
            if (gVar == null) {
                return null;
            }
            this.f134472a.d(gVar.mo41235x1e885992());
            gVar.mo41234xdc453139();
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled(java.lang.Object obj) {
        this.f134472a.e();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        this.f134472a.e();
    }
}
