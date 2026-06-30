package os3;

/* loaded from: classes8.dex */
public class y4 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 f429792a;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        this.f429792a = viewOnCreateContextMenuListenerC16941x4db497e1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean b(android.os.Bundle bundle) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public boolean c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429792a;
        if (str != null && str.startsWith("mailto:")) {
            java.lang.String replace = str.trim().replace("mailto:", "");
            android.content.Intent intent = new android.content.Intent(viewOnCreateContextMenuListenerC16941x4db497e1, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86.class);
            intent.putExtra("composeType", 4);
            intent.putExtra("toList", new java.lang.String[]{replace + " " + replace});
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e12 = this.f429792a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewOnCreateContextMenuListenerC16941x4db497e12, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            viewOnCreateContextMenuListenerC16941x4db497e12.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(viewOnCreateContextMenuListenerC16941x4db497e12, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (str == null || !str.startsWith("tel:")) {
                if (str != null && !str.startsWith("data:")) {
                    tx5.f fVar = viewOnCreateContextMenuListenerC16941x4db497e1.f236461g;
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2) fVar)).I) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.C19488x4bf6d262) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e2) fVar)).I = false;
                        return true;
                    }
                    if (str.startsWith("http")) {
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("rawUrl", str);
                        intent2.putExtra("geta8key_scene", 16);
                        j45.l.j(viewOnCreateContextMenuListenerC16941x4db497e1, "webview", ".ui.tools.WebViewUI", intent2, null);
                    }
                }
                return false;
            }
            android.content.Intent intent3 = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse(str));
            intent3.addFlags(268435456);
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e13 = this.f429792a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(viewOnCreateContextMenuListenerC16941x4db497e13, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            viewOnCreateContextMenuListenerC16941x4db497e13.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(viewOnCreateContextMenuListenerC16941x4db497e13, "com/tencent/mm/plugin/qqmail/ui/ReadMailUI$9", "handleUrlLoading", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x1
    /* renamed from: callback */
    public boolean mo70210xf5bc2045(int i17, android.os.Bundle bundle) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.y1
    public void d(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59, java.lang.String str) {
        c22633x83752a59.mo14660x738236e6("javascript:var meta = document.createElement(\"meta\");meta.name=\"viewport\";meta.id=\"viewport\";meta.content=\"initial-scale=1,user-scalable=yes,maximum-scale=3.0\";document.head.appendChild(meta);", null);
        c22633x83752a59.mo14660x738236e6("javascript:" + com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.N, null);
        c22633x83752a59.mo14660x738236e6("javascript:" + com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.P, null);
        c22633x83752a59.mo14660x738236e6("javascript:" + com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.Q, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429792a;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(viewOnCreateContextMenuListenerC16941x4db497e1.getMainLooper()).mo50297x7c4d7ca2(new os3.w4(this), 200L);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(viewOnCreateContextMenuListenerC16941x4db497e1.getMainLooper()).mo50297x7c4d7ca2(new os3.x4(this), 400L);
    }
}
