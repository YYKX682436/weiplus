package hs4;

/* loaded from: classes9.dex */
public class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f366146d;

    /* renamed from: e, reason: collision with root package name */
    public db5.g4 f366147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hs4.d f366148f;

    public c(hs4.d dVar) {
        this.f366148f = dVar;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f366147e.size() + this.f366148f.f366155g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return i17 < this.f366147e.size() ? 0 : 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        hs4.b bVar = (hs4.b) k3Var;
        int size = this.f366147e.size();
        hs4.d dVar = this.f366148f;
        if (i17 >= size) {
            if (dVar.f366155g.size() <= 0 || i17 >= this.f366147e.size() + dVar.f366155g.size()) {
                return;
            }
            db5.h4 h4Var = (db5.h4) ((java.util.ArrayList) dVar.f366155g.f309877d).get(i17 - this.f366147e.size());
            bVar.f366139d.setText(h4Var.getTitle());
            if (dVar.f366161m >= this.f366147e.size() + dVar.f366155g.size()) {
                dVar.f366161m = 0;
            }
            android.graphics.drawable.Drawable icon = h4Var.getIcon();
            android.content.Context context = dVar.f366150b;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = bVar.f366141f;
            if (icon != null) {
                c22699x3dcdb352.setVisibility(0);
                c22699x3dcdb352.setImageDrawable(h4Var.getIcon());
                int i18 = h4Var.f309911v;
                if (i18 != 0) {
                    c22699x3dcdb352.m82040x7541828(i18);
                } else {
                    c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                }
            } else {
                c22699x3dcdb352.setVisibility(8);
            }
            boolean z17 = h4Var.f309908s;
            android.widget.LinearLayout linearLayout = bVar.f366144i;
            android.widget.TextView textView = bVar.f366139d;
            if (z17) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560261fj));
                linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
                c22699x3dcdb352.setAlpha(0.1f);
            } else {
                textView.setTextColor(textView.getTextColors());
                linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.and);
            }
            android.widget.TextView textView2 = bVar.f366140e;
            if (textView2 != null) {
                if (android.text.TextUtils.isEmpty(h4Var.f309906q)) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView2.setText(h4Var.f309906q);
                }
                textView2.setImportantForAccessibility(2);
            }
            linearLayout.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdw, textView.getText(), textView2.getText()));
            boolean z18 = h4Var.f309908s;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = bVar.f366142g;
            if (z18) {
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.setVisibility(4);
                }
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560261fj));
                c22699x3dcdb352.setAlpha(0.1f);
            } else {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560262fk));
                if (c22699x3dcdb3522 != null) {
                    c22699x3dcdb3522.setVisibility(0);
                }
            }
            android.widget.ImageView imageView = bVar.f366143h;
            if (imageView != null) {
                imageView.setVisibility(0);
                return;
            }
            return;
        }
        if (dVar.f366161m >= this.f366147e.size()) {
            dVar.f366161m = 0;
        }
        bVar.f366144i.setFocusable(true);
        db5.h4 h4Var2 = (db5.h4) ((java.util.ArrayList) this.f366147e.f309877d).get(i17);
        java.lang.CharSequence title = h4Var2.getTitle();
        android.widget.TextView textView3 = bVar.f366139d;
        textView3.setText(title);
        android.graphics.drawable.Drawable icon2 = h4Var2.getIcon();
        android.content.Context context2 = dVar.f366150b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = bVar.f366141f;
        if (icon2 != null) {
            c22699x3dcdb3523.setVisibility(0);
            c22699x3dcdb3523.setImageDrawable(h4Var2.getIcon());
            int i19 = h4Var2.f309911v;
            if (i19 != 0) {
                c22699x3dcdb3523.m82040x7541828(i19);
            } else {
                c22699x3dcdb3523.m82040x7541828(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            }
        } else if (dVar.f366160l) {
            c22699x3dcdb3523.setVisibility(4);
        } else {
            c22699x3dcdb3523.setVisibility(8);
        }
        boolean z19 = h4Var2.f309908s;
        android.widget.LinearLayout linearLayout2 = bVar.f366144i;
        if (z19) {
            textView3.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560261fj));
            c22699x3dcdb3523.setAlpha(77);
            linearLayout2.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        } else {
            c22699x3dcdb3523.setAlpha(255);
            textView3.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560260fi));
        }
        android.widget.TextView textView4 = bVar.f366140e;
        if (textView4 != null) {
            if (android.text.TextUtils.isEmpty(h4Var2.f309906q)) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView4.setText(h4Var2.f309906q);
                if (dVar.f366159k) {
                    textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                }
            }
        }
        linearLayout2.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdw, textView3.getText(), textView4.getText()));
        boolean z27 = h4Var2.f309908s;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = bVar.f366142g;
        if (z27) {
            if (c22699x3dcdb3524 != null) {
                c22699x3dcdb3524.setVisibility(4);
            }
            textView4.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560261fj));
        } else {
            textView4.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560262fk));
            if (dVar.f366161m == i17) {
                if (c22699x3dcdb3524 != null) {
                    c22699x3dcdb3524.setVisibility(0);
                }
                linearLayout2.setContentDescription(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kdx, textView3.getText(), textView4.getText()));
            } else if (c22699x3dcdb3524 != null) {
                c22699x3dcdb3524.setVisibility(4);
            }
        }
        android.widget.ImageView imageView2 = bVar.f366143h;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (dVar.f366155g.size() == 0 && i17 == this.f366147e.size() - 1 && imageView2 != null) {
            ((android.widget.LinearLayout.LayoutParams) imageView2.getLayoutParams()).setMargins(0, 0, 0, 0);
        }
        textView4.setImportantForAccessibility(2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new hs4.b(this, android.view.LayoutInflater.from(this.f366148f.f366150b).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bt9, viewGroup, false), i17);
    }
}
