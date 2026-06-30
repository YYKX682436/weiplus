package cl1;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.k3 f42883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView f42884e;

    public j0(com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView, androidx.recyclerview.widget.k3 k3Var) {
        this.f42884e = dragFeatureView;
        this.f42883d = k3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.k3 k3Var = this.f42883d;
        if (k3Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView dragFeatureView = this.f42884e;
        int i17 = dragFeatureView.f91109m;
        int adapterPosition = k3Var.getAdapterPosition();
        if (adapterPosition >= 0 || i17 >= 0) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            boolean z17 = false;
            objArr[0] = java.lang.Boolean.valueOf(dragFeatureView.f91108i != k3Var);
            objArr[1] = java.lang.Boolean.valueOf(((dl1.f) dragFeatureView.f91105f).c(dragFeatureView.getRecyclerView(), dragFeatureView.f91108i, this.f42883d, i17, adapterPosition));
            objArr[2] = java.lang.Integer.valueOf(i17);
            objArr[3] = java.lang.Integer.valueOf(adapterPosition);
            com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "move run %b, onMove: %b, from: %d, to: %d", objArr);
            if (dragFeatureView.f91108i != k3Var) {
                if (((dl1.f) dragFeatureView.f91105f).c(dragFeatureView.getRecyclerView(), dragFeatureView.f91108i, this.f42883d, i17, adapterPosition)) {
                    dl1.c cVar = dragFeatureView.f91105f;
                    androidx.recyclerview.widget.RecyclerView recyclerView = dragFeatureView.getRecyclerView();
                    androidx.recyclerview.widget.k3 k3Var2 = dragFeatureView.f91108i;
                    dl1.f fVar = (dl1.f) cVar;
                    fVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ItemMoveHelper", "[onMoved] position:" + k3Var2.getAdapterPosition() + " target:" + k3Var.getAdapterPosition());
                    java.util.List list = fVar.f235179c;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ItemMoveHelper", "onMoved mList: %d", java.lang.Integer.valueOf(list.hashCode()));
                    if (i17 >= 0 && i17 < list.size() && adapterPosition >= 0 && adapterPosition < list.size()) {
                        if (i17 < adapterPosition) {
                            int i18 = i17;
                            while (i18 < adapterPosition) {
                                int i19 = i18 + 1;
                                java.util.Collections.swap(list, i18, i19);
                                i18 = i19;
                            }
                        } else {
                            int i27 = i17;
                            while (i27 > adapterPosition) {
                                int i28 = i27 - 1;
                                java.util.Collections.swap(list, i27, i28);
                                i27 = i28;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.ItemMoveHelper", "onMoved end mList: %d", java.lang.Integer.valueOf(list.hashCode()));
                        recyclerView.getAdapter().notifyItemMoved(i17, adapterPosition);
                        if (fVar.f235182f != null) {
                            fVar.f235184h = adapterPosition;
                        }
                        recyclerView.getAdapter().notifyItemRangeChanged(0, recyclerView.getAdapter().getItemCount(), java.lang.Boolean.TRUE);
                        z17 = true;
                    }
                    if (z17) {
                        dragFeatureView.f91109m = adapterPosition;
                    }
                }
            }
        }
    }
}
