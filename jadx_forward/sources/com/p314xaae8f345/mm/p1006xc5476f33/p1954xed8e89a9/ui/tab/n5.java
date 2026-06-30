package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f236023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f236024e;

    public n5(java.lang.ref.WeakReference weakReference, boolean z17) {
        this.f236023d = weakReference;
        this.f236024e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String d17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90 c16892x4a36dc90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.C16892x4a36dc90) this.f236023d.get();
        if (c16892x4a36dc90 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = c16892x4a36dc90.f235731d;
        if (activityC16840x4302a3e2.isFinishing() || activityC16840x4302a3e2.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16892x4a36dc90.f235739n;
        boolean z17 = this.f236024e;
        if (z3Var != null && (d17 = z3Var.d1()) != null) {
            gr3.e.d(d17, z17 ? 2803 : 2801, c16892x4a36dc90.f235734g, activityC16840x4302a3e2.getIntent(), c16892x4a36dc90.Z, c16892x4a36dc90.f235741p, 0, null, null, null, 0, 0, 4032, null);
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] switchToPhoto");
            c16892x4a36dc90.K = false;
            c16892x4a36dc90.L = false;
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g.f299275b.e(7, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.w6(new java.lang.ref.WeakReference(db5.e1.Q(c16892x4a36dc90.f235731d, null, null, true, false, null)), new java.lang.ref.WeakReference(c16892x4a36dc90)));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactWidgetTabBizInfo", "[PhotoAccountGuide] openRegisterPage");
        c16892x4a36dc90.K = true;
        c16892x4a36dc90.L = false;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("from", "profile_follow_guide");
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1422);
        jSONObject2.put("nativeExtraData", jSONObject.toString());
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        tk.t tVar = tk.u.f501404e;
        jSONObject3.put("mpPublishAction", 4);
        jSONObject3.put("publishScene", "photoAccountGuideCardByProfile");
        tk.s[] sVarArr = tk.s.f501403d;
        jSONObject3.put("bizType", 2);
        jSONObject3.put("weAppParam", jSONObject2);
        ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Ai(activityC16840x4302a3e2, jSONObject3, new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s5(new java.lang.ref.WeakReference(c16892x4a36dc90)));
    }
}
