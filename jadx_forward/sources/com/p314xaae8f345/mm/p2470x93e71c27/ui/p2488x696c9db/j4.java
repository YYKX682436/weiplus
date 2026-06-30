package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f273264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt0.i f273265e;

    public j4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var, android.util.SparseArray sparseArray, jt0.i iVar) {
        this.f273264d = sparseArray;
        this.f273265e = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "begin do recycled");
        int i17 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f273264d;
            if (i17 >= sparseArray.size()) {
                sparseArray.clear();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "clear drawable cache");
                this.f273265e.mo143584x5a5b64d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "end do recycled");
                return;
            }
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) sparseArray.valueAt(i17);
            if (bitmap != null) {
                bitmap.toString();
                bitmap.recycle();
            }
            i17++;
        }
    }
}
