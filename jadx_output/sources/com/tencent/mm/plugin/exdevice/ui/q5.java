package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes13.dex */
public final class q5 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f99631d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final o11.g f99632e;

    public q5() {
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.drawable.c1o;
        this.f99632e = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f99631d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.exdevice.ui.o5) ((java.util.LinkedList) this.f99631d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.exdevice.ui.p5 p5Var;
        r45.rw6 rw6Var;
        com.tencent.mm.plugin.exdevice.ui.o5 o5Var = (com.tencent.mm.plugin.exdevice.ui.o5) ((java.util.LinkedList) this.f99631d).get(i17);
        java.lang.String str = null;
        if (view == null) {
            p5Var = new com.tencent.mm.plugin.exdevice.ui.p5(null);
            view2 = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.a__, null);
            p5Var.f99619a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k3h);
            p5Var.f99620b = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.h5u);
            view2.setTag(p5Var);
        } else {
            view2 = view;
            p5Var = (com.tencent.mm.plugin.exdevice.ui.p5) view.getTag();
        }
        int i18 = com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI.f99329f;
        java.lang.String str2 = "";
        if (o5Var != null && (rw6Var = o5Var.f99607a) != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(rw6Var.f385251h)) {
                v32.b bVar = o5Var.f99608b;
                if (bVar != null) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f237106y)) {
                        str = bVar.f237106y;
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.B)) {
                        long j17 = bVar.field_mac;
                        if (j17 != 0) {
                            str = a42.i.f(j17);
                        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.field_deviceID)) {
                            str = bVar.field_deviceID;
                        }
                    } else {
                        str = bVar.B;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                }
            } else {
                str2 = o5Var.f99607a.f385251h;
            }
        }
        o5Var.getClass();
        p5Var.f99619a.setText(str2);
        n11.a.b().h(o5Var.f99607a.f385252i, p5Var.f99620b, this.f99632e);
        return view2;
    }
}
