package ku3;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f393953d;

    public u(ku3.i0 i0Var) {
        this.f393953d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.i0 i0Var = this.f393953d;
        if (i0Var.f393784d.N6(10) == 0) {
            zt3.a.U6(i0Var.f393784d, 10, 4, null, 4, null);
        } else {
            zt3.a aVar = i0Var.f393784d;
            if (aVar.f557116n) {
                z17 = false;
            } else {
                java.util.HashMap hashMap = aVar.f557111f;
                z17 = true;
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 1);
                java.util.HashMap hashMap2 = aVar.f557112g;
                hashMap2.put(1, new p012xc85e97e9.p093xedfae76a.j0());
                bs0.j jVar = aVar.f557110e;
                if (jVar.c(1) == 1) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 2);
                    hashMap2.put(2, new p012xc85e97e9.p093xedfae76a.j0());
                }
                if (jVar.c(2) == 1) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 3);
                    hashMap2.put(3, new p012xc85e97e9.p093xedfae76a.j0());
                }
                if (jVar.c(3) == 1) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 4);
                    hashMap2.put(4, new p012xc85e97e9.p093xedfae76a.j0());
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkSupportFilter >> ");
                boolean z18 = aVar.f557117o;
                sb6.append(z18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKit.Context", sb6.toString());
                if (z18) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 5);
                    hashMap2.put(5, new p012xc85e97e9.p093xedfae76a.j0());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKit.Context", "checkSupportBeauty >> " + z18);
                if (z18) {
                    hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 6);
                    hashMap2.put(6, new p012xc85e97e9.p093xedfae76a.j0());
                }
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 7);
                hashMap2.put(7, new p012xc85e97e9.p093xedfae76a.j0());
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 8);
                hashMap2.put(8, new p012xc85e97e9.p093xedfae76a.j0());
                hashMap.put(java.lang.Integer.valueOf(hashMap.size()), 9);
                hashMap2.put(9, new p012xc85e97e9.p093xedfae76a.j0());
                aVar.f557116n = true;
                aVar.f557115m.mo7808x76db6cb1(new zt3.b(1, null));
            }
            if (z17 && (mo7946xf939df19 = i0Var.a().mo7946xf939df19()) != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            zt3.a.U6(i0Var.f393784d, 10, 0, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
