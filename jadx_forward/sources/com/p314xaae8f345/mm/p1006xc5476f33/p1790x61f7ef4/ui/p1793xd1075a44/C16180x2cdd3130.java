package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44;

/* renamed from: com.tencent.mm.plugin.label.ui.widget.MMLabelPanel */
/* loaded from: classes11.dex */
public class C16180x2cdd3130 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a {
    public android.content.Context M;
    public boolean N;
    public boolean P;
    public db5.b7 Q;
    public db5.b7 R;
    public k93.b0 S;
    public k93.b0 T;
    public int U;
    public java.lang.String V;

    public C16180x2cdd3130(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = false;
        this.P = false;
        this.U = 0;
        this.V = null;
        y(context);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public java.lang.String c(android.widget.EditText editText, android.text.Editable editable, java.lang.String str, android.text.TextWatcher textWatcher) {
        int c17;
        editText.removeTextChangedListener(textWatcher);
        if (this.G > 0) {
            if (editable != null) {
                java.lang.String obj = editable.toString();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                    int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(obj);
                    com.p314xaae8f345.mm.ui.p2740x696c9db.v4.d(this.G, obj);
                    int i17 = this.G;
                    if (f17 > i17 && (c17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.c(i17, obj)) > 0 && c17 < this.G && c17 < obj.length()) {
                        editText.setText(obj.substring(0, c17 + 1));
                        editText.setSelection(editText.getText().length());
                    }
                }
            }
            str = editText.getText() != null ? editText.getText().toString() : "";
        }
        editText.addTextChangedListener(textWatcher);
        return str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public void d(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.MMLabelPanel", "addTag, want to add tag, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        p(trim);
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f309828a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.MMLabelPanel", "addTag, want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        db5.b7 i17 = i();
        t(i17, trim, z17);
        if (this.f279115n) {
            addView(i17.f309829b, getChildCount() - 1);
        } else {
            addView(i17.f309829b);
        }
        linkedList.add(i17);
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    /* renamed from: getEditViewLayoutId */
    public int mo65203x2298764a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.byp;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    /* renamed from: getSelectTagList */
    public java.util.ArrayList<java.lang.String> mo65204x8c275306() {
        android.widget.TextView textView;
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (b7Var != null && b7Var != this.R && b7Var != this.Q && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b7Var.f309828a) && (textView = b7Var.f309829b) != null && ((java.lang.Integer) textView.getTag()).intValue() == 1) {
                arrayList.add(b7Var.f309828a);
            }
        }
        return arrayList;
    }

    /* renamed from: getTagListWithIcon */
    public java.util.ArrayList<java.lang.String> m65205x39dc73a1() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b7Var.f309828a) && b7Var != this.R && b7Var != this.Q) {
                arrayList.add(b7Var.f309828a);
            }
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public android.widget.TextView j() {
        android.widget.TextView j17 = super.j();
        j17.setPadding(i65.a.a(this.M, 12.0f), i65.a.a(this.M, 5.0f), i65.a.a(this.M, 12.0f), i65.a.a(this.M, 6.0f));
        j17.setGravity(17);
        j17.setMinHeight(i65.a.a(this.M, 32.0f));
        j17.setTextSize(0, i65.a.f(this.M, com.p314xaae8f345.mm.R.C30860x5b28f31.f562119a84));
        return j17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public void m() {
        m79121x4cc68f0b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public void r(java.util.Collection collection, java.util.List list) {
        boolean z17;
        android.view.View view;
        e();
        if (this.f279115n) {
            addView(this.E);
        }
        if (list == null) {
            if (this.P) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, tags is null, needNewLebal.");
                addView(this.R.f309830c);
                return;
            }
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean z18 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            if (collection != null) {
                z18 = collection.contains(str);
            }
            d(str, z18);
        }
        if (this.P) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, needNewLebal.");
            addView(this.R.f309830c);
        }
        if (this.N) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, needGotoMorePage.");
            addView(this.Q.f309830c);
        }
        java.util.Iterator it6 = this.A.iterator();
        while (true) {
            if (!it6.hasNext()) {
                z17 = false;
                break;
            }
            db5.b7 b7Var = (db5.b7) it6.next();
            if (b7Var != this.Q && b7Var != this.R) {
                z17 = true;
                break;
            }
        }
        if (!this.N || (view = this.Q.f309830c) == null) {
            return;
        }
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Label.MMLabelPanel", "setTagListByTagName, tags.isEmpty.");
        android.view.View view2 = this.Q.f309830c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/label/ui/widget/MMLabelPanel", "checkMoreViewShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setClickDetailCallBack */
    public void m65206xb4f60fbc(k93.b0 b0Var) {
        this.S = b0Var;
    }

    /* renamed from: setClickNewLebalCallBack */
    public void m65207xa356bd1f(k93.b0 b0Var) {
        this.T = b0Var;
    }

    /* renamed from: setMaxLineSize */
    public void m65208x303709d7(int i17) {
    }

    /* renamed from: setNeedAddLastItemToMove */
    public void m65209x90ad12de(boolean z17) {
        this.N = z17;
    }

    /* renamed from: setNeedNewLebal */
    public void m65210x44603e6c(boolean z17) {
        this.P = z17;
    }

    public void v(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            db5.b7 b7Var = (db5.b7) it.next();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(b7Var.f309829b);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(b7Var.f309829b, "list_tag_item");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(b7Var.f309829b, "note_sid", str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(b7Var.f309829b, "add_username", str2);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(b7Var.f309829b, "list_tag_type", str3);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(b7Var.f309829b, new k93.y(this, b7Var));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(b7Var.f309829b, 8, i17);
        }
    }

    public void w(java.lang.String str, boolean z17, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.MMLabelPanel", "addTag2, want to add tag, but it is null or empty");
            return;
        }
        java.lang.String trim = str.trim();
        p(trim);
        java.util.LinkedList linkedList = this.A;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (trim.equals(((db5.b7) it.next()).f309828a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.MMLabelPanel", "addTag2,want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        db5.b7 i18 = i();
        t(i18, trim, z17);
        addView(i18.f309829b, i17);
        linkedList.add(i18);
        h();
    }

    public void x() {
        android.view.View inflate;
        this.R = i();
        if (this.U != 0) {
            inflate = android.view.LayoutInflater.from(getContext()).inflate(this.U, (android.view.ViewGroup) null);
            if (this.V != null) {
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567637k70)).setText(this.V);
            }
        } else {
            inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2a, (android.view.ViewGroup) null);
            ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k6z)).setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.M, com.p314xaae8f345.mm.R.raw.f79622x614cc289, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
        }
        inflate.setOnClickListener(new k93.a0(this));
        this.R.f309830c = inflate;
        this.Q.f309829b.setText("");
    }

    public final void y(android.content.Context context) {
        this.M = context;
        this.Q = i();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a2b, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566713gt5);
        inflate.setOnClickListener(new k93.z(this));
        if (this.Q != null) {
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.M, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77689x3cb0703)));
        }
        this.Q.f309829b.setText("");
        this.Q.f309830c = inflate;
        x();
        m79138x7e5ecb64(com.p314xaae8f345.mm.R.C30861xcebc809e.f563662b31);
        m79140x4a0e4618(com.p314xaae8f345.mm.R.C30861xcebc809e.f563663b32);
        m79139xb10bdb09(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834);
        m79141x9bf884bd(com.p314xaae8f345.mm.R.C30859x5a72f63.f560396j9);
        m79133xb7cc93f7(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562119a84));
    }

    public C16180x2cdd3130(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = false;
        this.P = false;
        this.U = 0;
        this.V = null;
        y(context);
    }
}
