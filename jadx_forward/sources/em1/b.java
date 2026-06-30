package em1;

/* loaded from: classes7.dex */
public class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9
    public void a(java.util.ArrayList arrayList, java.lang.String str, boolean z17, java.lang.String str2) {
        super.a(arrayList, str, z17, str2);
        arrayList.add(new em1.o(this.f173914a.X0() + "shared_buffer.js", ik1.f.e("wxa_library/shared_buffer.js"), (java.lang.String) null, this.f173914a.mo48798x74292566(), this.f173914a.H0()));
        arrayList.add(new em1.o(this.f173914a.X0() + "android.js", ik1.f.e("wxa_library/android.js"), (java.lang.String) null, this.f173914a.mo48798x74292566(), this.f173914a.H0()));
        arrayList.add(new em1.o(this.f173914a.X0() + "lazy_load.js", ik1.f.e("wxa_library/lazy_load.js"), (java.lang.String) null, this.f173914a.mo48798x74292566(), this.f173914a.H0()));
        arrayList.add(e("WAWorker.js"));
        if (u46.l.c("wxlib", str2) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f173914a.t3().f156338p.f158814g)) {
            return;
        }
        arrayList.add(new cl.j3(this.f173914a.X0() + "WASourceMap.js", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nf.c(this.f173914a)));
        arrayList.add(new cl.j3(this.f173914a.X0() + "sourcemapSysinfo", java.lang.String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap.__system = 'Android %s')", android.os.Build.VERSION.RELEASE)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9
    public cl.l3 b() {
        return new em1.a(this, this.f173924k);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9
    public cl.j3 e(java.lang.String str) {
        java.lang.String M = this.f173914a.x().M(str);
        com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
        c1481x17e6a5e9.f4814xcdd22c98 = M;
        c1481x17e6a5e9.f4815xcdd276a5 = 3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWorkerContainerLU", "getCommLibScript(%s), fd is null, fallback to createTextEvalRequest", str);
        java.lang.String str2 = this.f173914a.X0() + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(str);
        java.lang.String str3 = p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2967xc3bba14a + this.f173914a.x().i();
        c1481x17e6a5e9.f4813xcdcf61f6 = str2;
        c1481x17e6a5e9.f4808x7f1f2ea0 = str;
        c1481x17e6a5e9.f4809xe6292f7d = str3;
        em1.o oVar = new em1.o(str2, c1481x17e6a5e9, (java.lang.String) null, this.f173914a.mo48798x74292566(), this.f173914a.H0());
        oVar.f336601f = this.f173914a.x();
        return oVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x9
    public cl.j3 f(java.lang.String str) {
        cl.j3 j3Var;
        if (android.text.TextUtils.isEmpty(this.f173914a.a1(str))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.la.o(this.f173914a.t3(), false).mo49254xc00e82af(str);
            if (mo49254xc00e82af == null) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f173914a;
                objArr[0] = e9Var != null ? e9Var.mo48798x74292566() : null;
                objArr[1] = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandWorkerContainerLU", "getUsrScript for appId:%s, path:%s, file not found", objArr);
                return null;
            }
            java.lang.String str2 = this.f173914a.b1() + str;
            j3Var = new cl.j3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.d(str, mo49254xc00e82af, str2));
        } else {
            j3Var = super.f(str);
        }
        return new em1.o(j3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nf.a(this.f173914a.t3(), str, this.f173914a.b1()), this.f173914a.mo48798x74292566(), this.f173914a.H0());
    }
}
