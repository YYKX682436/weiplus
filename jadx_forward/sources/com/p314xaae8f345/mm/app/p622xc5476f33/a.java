package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p622xc5476f33.e f135172d;

    public a(com.p314xaae8f345.mm.app.p622xc5476f33.e eVar) {
        this.f135172d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddContact", "check short link timeout");
        com.p314xaae8f345.mm.app.p622xc5476f33.e eVar = this.f135172d;
        eVar.f135184o.set(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = eVar.f135178f;
        if (u3Var != null) {
            u3Var.dismiss();
            eVar.f135178f = null;
        }
        android.content.Context context = eVar.f135177e;
        db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572094yj), 1).show();
        eVar.a(false, null);
    }
}
