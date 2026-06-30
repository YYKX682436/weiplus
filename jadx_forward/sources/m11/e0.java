package m11;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m11.f0 f404211d;

    public e0(m11.f0 f0Var) {
        this.f404211d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        android.view.View view;
        android.widget.ImageView imageView;
        m11.f0 f0Var = this.f404211d;
        m11.l0 l0Var = f0Var.f404225m;
        java.lang.String str = f0Var.f404220e;
        java.lang.String str2 = f0Var.f404224i;
        boolean z17 = f0Var.f404222g;
        int i17 = f0Var.f404223h;
        l0Var.getClass();
        ((java.util.HashSet) l0Var.f404276m).remove(java.lang.Integer.valueOf(str.hashCode()));
        java.util.Iterator it = ((java.util.ArrayList) l0Var.f404272f).iterator();
        while (it.hasNext()) {
            m11.i0 i0Var = (m11.i0) it.next();
            if (str.equals(i0Var.f404244b) && (bitmap = (android.graphics.Bitmap) ((jt0.i) l0Var.f404271e).i(str)) != null && !bitmap.isRecycled()) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) ((java.lang.ref.WeakReference) ((java.util.HashMap) l0Var.f404273g).get(java.lang.Integer.valueOf(i0Var.f404243a))).get();
                if (imageView2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgInfoStorage", "[checkrefresh] bitmap width %d,height %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                    if (m11.l0.f404268v == 1) {
                        try {
                            if (imageView2.getTag() != null && !imageView2.getTag().toString().equals(str2)) {
                            }
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgInfoStorage", "checkrefresh check diff error = " + th6.getMessage());
                        }
                    }
                    m11.h0.a(bitmap, imageView2);
                    imageView2.setLayoutParams(l0Var.f404280q);
                    boolean z18 = bitmap.getWidth() >= bitmap.getHeight() * 2;
                    boolean z19 = bitmap.getHeight() >= bitmap.getWidth() * 2;
                    if (z18 || z19) {
                        bitmap.getWidth();
                        bitmap.getHeight();
                        imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                    }
                    java.util.Map map = l0Var.f404274h;
                    int i18 = i0Var.f404245c;
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    if (hashMap.get(java.lang.Integer.valueOf(i18)) != null && (imageView = (android.widget.ImageView) ((java.lang.ref.WeakReference) hashMap.get(java.lang.Integer.valueOf(i18))).get()) != null) {
                        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
                    }
                    java.util.Map map2 = l0Var.f404275i;
                    int i19 = i0Var.f404246d;
                    java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                    if (hashMap2.get(java.lang.Integer.valueOf(i19)) != null && (view = (android.view.View) ((java.lang.ref.WeakReference) hashMap2.get(java.lang.Integer.valueOf(i19))).get()) != null) {
                        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
                    }
                }
            }
        }
    }
}
