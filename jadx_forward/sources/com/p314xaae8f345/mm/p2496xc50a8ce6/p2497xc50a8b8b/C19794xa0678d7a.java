package com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b;

/* renamed from: com.tencent.mm.protocal.protobuf.FinderTipsShowDiscoveryExtInfo */
/* loaded from: classes2.dex */
public class C19794xa0678d7a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: show_ext_info */
    public java.lang.String f38905xfada230e;

    /* renamed from: create */
    public static final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a m77019xaf65a0fc() {
        return new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a) && n51.f.a(this.f38905xfada230e, ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a) fVar).f38905xfada230e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: fromJson */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L41
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb
            goto L41
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L41
            r0.<init>(r5)     // Catch: java.lang.Exception -> L41
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L41
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L41
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L41
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L41
            r3 = -86367474(0xfffffffffada230e, float:-5.6631585E35)
            if (r2 == r3) goto L2a
            goto L34
        L2a:
            java.lang.String r2 = "show_ext_info"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L34
            r2 = 0
            goto L35
        L34:
            r2 = -1
        L35:
            if (r2 == 0) goto L38
            goto L14
        L38:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L41
            r4.f38905xfada230e = r1     // Catch: java.lang.Exception -> L41
            goto L14
        L41:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a.mo75930xb5cb93b2(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f38905xfada230e;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f38905xfada230e;
            if (str2 != null) {
                return 0 + b36.f.j(1, str2);
            }
            return 0;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a c19794xa0678d7a = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        c19794xa0678d7a.f38905xfada230e = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setShow_ext_info */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19794xa0678d7a m77020x4b1045cc(java.lang.String str) {
        this.f38905xfada230e = str;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: toJSON */
    public org.json.JSONObject mo12245xcc313de3() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            n51.f.f416647a.d(jSONObject, "show_ext_info", this.f38905xfada230e, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
