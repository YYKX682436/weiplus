package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class u3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f99689d = new com.tencent.mm.plugin.exdevice.ui.s3(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView f99690e;

    public u3(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView exdeviceProfileAffectedUserView, com.tencent.mm.plugin.exdevice.ui.p3 p3Var) {
        this.f99690e = exdeviceProfileAffectedUserView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.ArrayList arrayList = this.f99690e.f99301h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f99690e.f99301h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.exdevice.ui.t3 t3Var;
        com.tencent.mm.modelavatar.r0 n07;
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView exdeviceProfileAffectedUserView = this.f99690e;
        java.lang.String str = (java.lang.String) exdeviceProfileAffectedUserView.f99301h.get(i17);
        if (view == null) {
            view = android.view.LayoutInflater.from(exdeviceProfileAffectedUserView.getContext()).inflate(com.tencent.mm.R.layout.a_8, viewGroup, false);
            t3Var = new com.tencent.mm.plugin.exdevice.ui.t3(this);
            t3Var.f99677a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9m);
            view.setTag(t3Var);
        } else {
            t3Var = (com.tencent.mm.plugin.exdevice.ui.t3) view.getTag();
        }
        java.lang.Runnable runnable = this.f99689d;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.s0 Ni = com.tencent.mm.modelavatar.d1.Ni();
        if (Ni != null && ((n07 = Ni.n0(str)) == null || com.tencent.mm.sdk.platformtools.t8.K0(n07.d()))) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            ((c01.k7) c01.n8.a()).b(str, 21, new com.tencent.mm.plugin.exdevice.model.p0(java.lang.System.currentTimeMillis(), runnable));
        }
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = t3Var.f99677a;
        ((com.tencent.mm.feature.avatar.w) zVar).getClass();
        com.tencent.mm.pluginsdk.ui.u.b(imageView, str, 0.5f, true);
        return view;
    }
}
