package com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046;

/* loaded from: classes12.dex */
public final class e4 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4 f147775a;

    public e4(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4 f4Var) {
        this.f147775a = f4Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f147775a.f147797d, "create emoticonGlobalStore fail");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4 f4Var = this.f147775a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f4Var.f147797d, "create emoticonGlobalStore success");
        f4Var.f147800g = true;
        f4Var.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        r45.we3 z07 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().e().z0(5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (z07 != null) {
            java.util.Iterator it = z07.f470619f.iterator();
            while (it.hasNext()) {
                r45.zj0 zj0Var = (r45.zj0) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(zj0Var);
                arrayList.add(f4Var.Di(zj0Var));
            }
            java.util.Iterator it6 = z07.f470626p.iterator();
            while (it6.hasNext()) {
                r45.kj0 kj0Var = (r45.kj0) it6.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kj0Var);
                arrayList2.add(f4Var.Bi(kj0Var));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f4Var.f147797d, "sendNativeEmoticonCache");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("emotionSummary", arrayList);
        jSONObject.putOpt("emotionBannerSet", arrayList2);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj(f4Var.f147798e, f4Var.f147799f, jSONObject);
        }
    }
}
