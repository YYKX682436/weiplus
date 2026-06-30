package e33;

/* loaded from: classes10.dex */
public class k5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f328843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 f328844e;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 activityC15658x91352037, android.content.Context context) {
        this.f328844e = activityC15658x91352037;
        this.f328843d = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f328844e.f220149d.size() + 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078;
        e33.l5 l5Var = (e33.l5) k3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 activityC15658x91352037 = this.f328844e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = i17 == 0 ? activityC15658x91352037.f220152g : (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) activityC15658x91352037.f220149d.get(i17 - 1);
        l5Var.f328869i.setOnClickListener(this);
        l5Var.f328869i.setTag(c15630x7d8d0183);
        java.lang.String str = activityC15658x91352037.f220153h;
        android.widget.ImageView imageView = l5Var.f328868h;
        if (str == null || !(str.equals(c15630x7d8d0183.f219948d) || (activityC15658x91352037.f220153h.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037.T6(activityC15658x91352037)) && i17 == 0))) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
        android.widget.TextView textView = l5Var.f328867g;
        android.widget.ImageView imageView2 = l5Var.f328864d;
        android.widget.TextView textView2 = l5Var.f328866f;
        if (i17 == 0) {
            imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ccy);
            if (c15630x7d8d0183.f219953i != null) {
                e33.m6.a(l5Var.f328864d, c15630x7d8d0183.o(), c15630x7d8d0183.n(), c15630x7d8d0183.h(), c15630x7d8d0183.i(), i17, c15630x7d8d0183.m());
            }
            textView2.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037.T6(activityC15658x91352037));
            imageView2.setVisibility(0);
            textView2.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        imageView2.setVisibility(0);
        textView2.setVisibility(0);
        textView2.setText(c15630x7d8d0183.f219948d);
        textView.setVisibility(0);
        textView.setText(this.f328843d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fiv, java.lang.String.valueOf(c15630x7d8d0183.f219950f)));
        android.widget.ImageView imageView3 = l5Var.f328865e;
        if (imageView3 != null && (abstractC15633xee433078 = c15630x7d8d0183.f219953i) != null) {
            imageView3.setVisibility(abstractC15633xee433078.mo63659xfb85f7b0() != 2 ? 8 : 0);
        }
        java.lang.String n17 = c15630x7d8d0183.n();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17) && c15630x7d8d0183.f219953i != null) {
            e33.m6.a(l5Var.f328864d, c15630x7d8d0183.o(), n17, c15630x7d8d0183.h(), c15630x7d8d0183.i(), i17, c15630x7d8d0183.m());
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee4330782 = c15630x7d8d0183.f219953i;
        if (abstractC15633xee4330782 != null && abstractC15633xee4330782.mo63659xfb85f7b0() == 2) {
            e33.m6.a(l5Var.f328864d, c15630x7d8d0183.o(), null, c15630x7d8d0183.h(), c15630x7d8d0183.i(), i17, c15630x7d8d0183.m());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectAlbumPreviewFolderUI", "get folder failed");
        imageView2.setVisibility(8);
        textView2.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/SelectAlbumPreviewFolderUI$SelectImageFolderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15658x91352037 activityC15658x91352037 = this.f328844e;
        android.content.Intent intent = new android.content.Intent(activityC15658x91352037, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.class);
        intent.putExtra("select_folder_name", (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) view.getTag());
        intent.setFlags(67108864);
        activityC15658x91352037.setResult(-1, intent);
        activityC15658x91352037.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/SelectAlbumPreviewFolderUI$SelectImageFolderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new e33.l5(this.f328844e, android.view.LayoutInflater.from(this.f328843d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cif, viewGroup, false));
    }
}
