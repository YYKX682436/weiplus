package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p622xc5476f33.e f135174d;

    public c(com.p314xaae8f345.mm.app.p622xc5476f33.e eVar) {
        this.f135174d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "startShowLoading");
        com.p314xaae8f345.mm.app.p622xc5476f33.e eVar = this.f135174d;
        android.content.Context context = eVar.f135177e;
        eVar.f135178f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), eVar.f135177e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.app.p622xc5476f33.b(this));
    }
}
