package jx3;

/* loaded from: classes12.dex */
public enum f implements jx3.c {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public jx3.c f383981d = new jx3.e(null);

    f() {
    }

    public static java.lang.Object A(int i17, int[] iArr, java.lang.Object[] objArr) {
        if (iArr == null || iArr.length < 1 || objArr == null || iArr.length + 1 != objArr.length) {
            return null;
        }
        int i18 = 0;
        if (i17 <= iArr[0]) {
            return objArr[0];
        }
        while (i18 < iArr.length - 1) {
            int i19 = iArr[i18];
            i18++;
            int i27 = iArr[i18];
            if (i19 >= i27) {
                return null;
            }
            if (i17 > i19 && i17 <= i27) {
                return objArr[i18];
            }
        }
        return objArr[objArr.length - 1];
    }

    public static java.lang.Object y(int i17, int[] iArr, int i18, int i19) {
        if (iArr == null || iArr.length < 1 || i19 <= i18 || i19 > 255 || iArr.length != i19 - i18) {
            return null;
        }
        int i27 = 0;
        if (i17 <= iArr[0]) {
            return java.lang.Integer.valueOf(i18);
        }
        while (i27 < iArr.length - 1) {
            int i28 = iArr[i27];
            int i29 = i27 + 1;
            int i37 = iArr[i29];
            if (i28 >= i37) {
                return null;
            }
            if (i17 > i28 && i17 <= i37) {
                return java.lang.Integer.valueOf(i18 + 1 + i27);
            }
            i27 = i29;
        }
        return java.lang.Integer.valueOf(i19);
    }

    @Override // jx3.c
    public void a(int i17) {
        this.f383981d.a(i17);
    }

    @Override // jx3.c
    public void b(java.util.ArrayList arrayList, boolean z17) {
        this.f383981d.b(arrayList, z17);
    }

    @Override // jx3.c
    public void d(int i17, java.lang.Object... objArr) {
        this.f383981d.d(i17, objArr);
    }

    @Override // jx3.c
    public void e(int i17, int i18, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        this.f383981d.e(i17, i18, str, z17, z18, z19);
    }

    @Override // jx3.c
    public void f(int i17, java.lang.String str, boolean z17, boolean z18) {
        this.f383981d.f(i17, str, z17, z18);
    }

    @Override // jx3.c
    public void g(int i17, boolean z17, boolean z18, boolean z19, java.lang.Object... objArr) {
        this.f383981d.g(i17, z17, z18, z19, objArr);
    }

    @Override // jx3.c
    public boolean h(int i17, java.lang.String str) {
        return this.f383981d.h(i17, str);
    }

    @Override // jx3.c
    public void i(java.lang.String str, java.lang.String str2, java.util.Map map) {
        this.f383981d.i(str, str2, map);
    }

    @Override // jx3.c
    /* renamed from: idkeyStat */
    public void mo68477x336bdfd8(long j17, long j18, long j19, boolean z17) {
        this.f383981d.mo68477x336bdfd8(j17, j18, j19, z17);
    }

    @Override // jx3.c
    public void j(java.util.ArrayList arrayList, boolean z17, boolean z18) {
        this.f383981d.j(arrayList, z17, z18);
    }

    @Override // jx3.c
    public void k(int i17, int i18, int i19, int i27, int i28, int i29, boolean z17) {
        this.f383981d.k(i17, i18, i19, i27, i28, i29, z17);
    }

    @Override // jx3.c
    /* renamed from: kvStat */
    public void mo68478xbd3cda5f(int i17, java.lang.String str) {
        this.f383981d.mo68478xbd3cda5f(i17, str);
    }

    @Override // jx3.c
    public void l(int i17, java.util.List list) {
        this.f383981d.l(i17, list);
    }

    @Override // jx3.c
    public void m(int i17, int i18, int i19, int i27, boolean z17) {
        this.f383981d.m(i17, i18, i19, i27, z17);
    }

    @Override // jx3.c
    public void n(int i17, int i18, java.lang.String str, boolean z17, boolean z18) {
        this.f383981d.n(i17, i18, str, z17, z18);
    }

    @Override // jx3.c
    public void o() {
        this.f383981d.o();
    }

    @Override // jx3.c
    public void p(int i17, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        this.f383981d.p(i17, str, z17, z18, z19);
    }

    @Override // jx3.c
    public void r(int i17, boolean z17, boolean z18, java.lang.Object... objArr) {
        this.f383981d.r(i17, z17, z18, objArr);
    }

    public java.lang.String s(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportService", "vals is null, use '' as value");
            return "";
        }
        if (objArr.length == 1) {
            return java.lang.String.valueOf(objArr[0]);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int length = objArr.length - 1;
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append(java.lang.String.valueOf(objArr[i17]).replace(',', ' '));
            sb6.append(',');
        }
        sb6.append(java.lang.String.valueOf(objArr[length]));
        return sb6.toString();
    }

    public void t(int i17, int i18) {
        u(i17, i18);
    }

    public void u(long j17, long j18) {
        w(j17, j18, 1L);
    }

    public void w(long j17, long j18, long j19) {
        mo68477x336bdfd8(j17, j18, j19, false);
    }
}
