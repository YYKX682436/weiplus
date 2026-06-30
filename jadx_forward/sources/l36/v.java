package l36;

/* loaded from: classes16.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final l36.v f397191e;

    /* renamed from: f, reason: collision with root package name */
    public static final l36.v f397192f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f397193a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f397194b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String[] f397195c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String[] f397196d;

    static {
        l36.r rVar = l36.r.f397155q;
        l36.r rVar2 = l36.r.f397156r;
        l36.r rVar3 = l36.r.f397157s;
        l36.r rVar4 = l36.r.f397158t;
        l36.r rVar5 = l36.r.f397159u;
        l36.r rVar6 = l36.r.f397149k;
        l36.r rVar7 = l36.r.f397151m;
        l36.r rVar8 = l36.r.f397150l;
        l36.r rVar9 = l36.r.f397152n;
        l36.r rVar10 = l36.r.f397154p;
        l36.r rVar11 = l36.r.f397153o;
        l36.r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11};
        l36.r[] rVarArr2 = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, l36.r.f397147i, l36.r.f397148j, l36.r.f397145g, l36.r.f397146h, l36.r.f397143e, l36.r.f397144f, l36.r.f397142d};
        l36.u uVar = new l36.u(true);
        uVar.b(rVarArr);
        l36.e1 e1Var = l36.e1.TLS_1_3;
        l36.e1 e1Var2 = l36.e1.TLS_1_2;
        uVar.d(e1Var, e1Var2);
        uVar.f397183d = true;
        new l36.v(uVar);
        l36.u uVar2 = new l36.u(true);
        uVar2.b(rVarArr2);
        l36.e1 e1Var3 = l36.e1.TLS_1_1;
        l36.e1 e1Var4 = l36.e1.TLS_1_0;
        uVar2.d(e1Var, e1Var2, e1Var3, e1Var4);
        uVar2.f397183d = true;
        f397191e = new l36.v(uVar2);
        l36.u uVar3 = new l36.u(true);
        uVar3.b(rVarArr2);
        uVar3.d(e1Var4);
        uVar3.f397183d = true;
        new l36.v(uVar3);
        f397192f = new l36.v(new l36.u(false));
    }

    public v(l36.u uVar) {
        this.f397193a = uVar.f397180a;
        this.f397195c = uVar.f397181b;
        this.f397196d = uVar.f397182c;
        this.f397194b = uVar.f397183d;
    }

    public boolean a(javax.net.ssl.SSLSocket sSLSocket) {
        if (!this.f397193a) {
            return false;
        }
        java.lang.String[] strArr = this.f397196d;
        if (strArr != null && !m36.e.p(m36.e.f404924f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        java.lang.String[] strArr2 = this.f397195c;
        return strArr2 == null || m36.e.p(l36.r.f397140b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: equals */
    public boolean m145049xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof l36.v)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        l36.v vVar = (l36.v) obj;
        boolean z17 = vVar.f397193a;
        boolean z18 = this.f397193a;
        if (z18 != z17) {
            return false;
        }
        return !z18 || (java.util.Arrays.equals(this.f397195c, vVar.f397195c) && java.util.Arrays.equals(this.f397196d, vVar.f397196d) && this.f397194b == vVar.f397194b);
    }

    /* renamed from: hashCode */
    public int m145050x8cdac1b() {
        if (this.f397193a) {
            return ((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + java.util.Arrays.hashCode(this.f397195c)) * 31) + java.util.Arrays.hashCode(this.f397196d)) * 31) + (!this.f397194b ? 1 : 0);
        }
        return 17;
    }

    /* renamed from: toString */
    public java.lang.String m145051x9616526c() {
        java.lang.String str;
        java.util.List list;
        if (!this.f397193a) {
            return "ConnectionSpec()";
        }
        java.util.List list2 = null;
        java.lang.String str2 = "[all enabled]";
        java.lang.String[] strArr = this.f397195c;
        if (strArr != null) {
            if (strArr != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
                for (java.lang.String str3 : strArr) {
                    arrayList.add(l36.r.a(str3));
                }
                list = java.util.Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = "[all enabled]";
        }
        java.lang.String[] strArr2 = this.f397196d;
        if (strArr2 != null) {
            if (strArr2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(strArr2.length);
                for (java.lang.String str4 : strArr2) {
                    arrayList2.add(l36.e1.a(str4));
                }
                list2 = java.util.Collections.unmodifiableList(arrayList2);
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f397194b + ")";
    }
}
