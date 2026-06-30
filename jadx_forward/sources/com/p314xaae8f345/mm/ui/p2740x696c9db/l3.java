package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class l3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public int f292077d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 f292078e;

    public l3(com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8) {
        this.f292078e = c22502x1bc6a5e8;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.n3[] n3VarArr = com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8.f291574r;
        return 12;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8.f291574r[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.k3 k3Var;
        com.p314xaae8f345.mm.ui.p2740x696c9db.n3 n3Var = com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8.f291574r[i17];
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8 = this.f292078e;
        if (view == null || !(view.getTag() instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.k3)) {
            view = android.view.View.inflate(c22502x1bc6a5e8.f291575d, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570311ad5, null);
            k3Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.k3(this);
            k3Var.f292060a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.e4z);
            k3Var.f292061b = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.e4y);
            view.setTag(k3Var);
        } else {
            k3Var = (com.p314xaae8f345.mm.ui.p2740x696c9db.k3) view.getTag();
            android.graphics.Bitmap bitmap = k3Var.f292062c;
            if (bitmap != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FilterView", "recycle bitmap:%s", bitmap.toString());
                k3Var.f292062c.recycle();
            }
        }
        android.widget.TextView textView = k3Var.f292060a;
        com.p314xaae8f345.mm.ui.p2740x696c9db.m3 m3Var = n3Var.f292127a;
        m3Var.getClass();
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        textView.setText(d17.equals("zh_CN") ? m3Var.f292098a : (d17.equals("zh_TW") || d17.equals("zh_HK")) ? m3Var.f292099b : m3Var.f292100c);
        try {
            java.io.InputStream open = c22502x1bc6a5e8.f291575d.getAssets().open("filter/" + n3Var.f292131e);
            k3Var.f292062c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.O(open);
            open.close();
            k3Var.f292061b.setImageBitmap(k3Var.f292062c);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FilterView", e17, "", new java.lang.Object[0]);
        }
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        if (i17 == this.f292077d) {
            view.findViewById(com.p314xaae8f345.mm.R.id.e4y).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgq);
        } else {
            view.findViewById(com.p314xaae8f345.mm.R.id.e4y).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bgr);
        }
        return view;
    }
}
