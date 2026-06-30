package yd5;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f542633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f542634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f542635f;

    public i(yd5.j jVar, boolean z17, boolean z18, int[] iArr) {
        this.f542633d = z17;
        this.f542634e = z18;
        this.f542635f = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = this.f542633d;
        int[] iArr = this.f542635f;
        if (!z17) {
            if (iArr[0] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 20, iArr[0]));
            }
            if (iArr[1] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 21, iArr[1]));
            }
            if (iArr[2] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 22, iArr[2]));
            }
            if (iArr[3] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 23, iArr[3]));
            }
            if (iArr[4] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 24, iArr[4]));
            }
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 39, 1));
        } else if (this.f542634e) {
            if (iArr[0] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 40, iArr[0]));
            }
            if (iArr[1] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 41, iArr[1]));
            }
            if (iArr[2] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 42, iArr[2]));
            }
            if (iArr[3] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 43, iArr[3]));
            }
            if (iArr[4] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 44, iArr[4]));
            }
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 59, 1));
        } else {
            if (iArr[0] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 0, iArr[0]));
            }
            if (iArr[1] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 1, iArr[1]));
            }
            if (iArr[2] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 2, iArr[2]));
            }
            if (iArr[3] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 3, iArr[3]));
            }
            if (iArr[4] > 0) {
                arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 4, iArr[4]));
            }
            arrayList.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(uc1.o1.f76898x366c91de, 19, 1));
        }
        jx3.f.INSTANCE.b(arrayList, true);
    }
}
