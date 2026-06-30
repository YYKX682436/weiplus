package kk;

/* loaded from: classes9.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f390007a;

    /* renamed from: b, reason: collision with root package name */
    public final kk.s[] f390008b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f390009c;

    /* renamed from: d, reason: collision with root package name */
    public int f390010d = 0;

    public t(int i17) {
        this.f390007a = i17;
        this.f390008b = new kk.s[i17];
        this.f390009c = new java.util.HashMap(i17);
    }

    public synchronized java.lang.Object a(java.lang.Object obj) {
        kk.s sVar = (kk.s) this.f390009c.get(obj);
        if (sVar == null) {
            return null;
        }
        sVar.f390005f = java.lang.System.currentTimeMillis();
        c(sVar.f390006g);
        return sVar.f390004e;
    }

    public synchronized java.lang.Object b(java.lang.Object obj, java.lang.Object obj2) {
        kk.s sVar = (kk.s) this.f390009c.get(obj);
        if (sVar != null) {
            java.lang.Object obj3 = sVar.f390004e;
            sVar.f390004e = obj2;
            sVar.f390005f = java.lang.System.currentTimeMillis();
            c(sVar.f390006g);
            return obj3;
        }
        int i17 = this.f390010d;
        if (i17 >= this.f390007a) {
            this.f390009c.remove(this.f390008b[0].f390003d);
            kk.s sVar2 = new kk.s(obj, obj2, 0);
            this.f390008b[0] = sVar2;
            c(sVar2.f390006g);
            this.f390009c.put(obj, sVar2);
        } else {
            kk.s sVar3 = new kk.s(obj, obj2, i17);
            kk.s[] sVarArr = this.f390008b;
            int i18 = this.f390010d;
            this.f390010d = i18 + 1;
            sVarArr[i18] = sVar3;
            this.f390009c.put(obj, sVar3);
        }
        return null;
    }

    public final void c(int i17) {
        int i18 = i17 << 1;
        int i19 = i18 + 1;
        int i27 = i18 + 2;
        int i28 = this.f390010d;
        if (i19 >= i28) {
            return;
        }
        kk.s[] sVarArr = this.f390008b;
        if (i27 >= i28) {
            if (sVarArr[i17].f390005f >= sVarArr[i19].f390005f) {
                d(i17, i19);
                c(i19);
                return;
            }
            return;
        }
        long j17 = sVarArr[i19].f390005f;
        long j18 = sVarArr[i27].f390005f;
        long j19 = j17 - j18;
        if (j19 <= 0 && j17 <= sVarArr[i17].f390005f) {
            d(i17, i19);
            c(i19);
        } else {
            if (j19 <= 0 || j18 > sVarArr[i17].f390005f) {
                return;
            }
            d(i17, i27);
            c(i27);
        }
    }

    public final void d(int i17, int i18) {
        kk.s[] sVarArr = this.f390008b;
        kk.s sVar = sVarArr[i17];
        kk.s sVar2 = sVarArr[i18];
        sVarArr[i17] = sVar2;
        sVar2.f390006g = i17;
        sVarArr[i18] = sVar;
        sVar.f390006g = i18;
    }
}
