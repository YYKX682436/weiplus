package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class t9 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.u9 f291424d;

    public t9(com.p314xaae8f345.mm.ui.u9 u9Var) {
        this.f291424d = u9Var;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.LinkedList linkedList = this.f291424d.f292608b;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        java.util.LinkedList linkedList = this.f291424d.f292608b;
        if (linkedList == null) {
            return null;
        }
        return (oo0.a) linkedList.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.u9 u9Var = this.f291424d;
        if (view == null) {
            u9Var.getClass();
            throw null;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(view.getTag());
        java.util.LinkedList linkedList = u9Var.f292608b;
        (linkedList == null ? null : (oo0.a) linkedList.get(i17)).getClass();
        throw null;
    }
}
