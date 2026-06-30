package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class KindaActionSheetImpl implements com.tencent.kinda.gen.KActionSheet {
    private java.lang.String cancelTitle;
    private com.tencent.mm.ui.widget.dialog.k0 sheet;
    private java.lang.String title;
    private int mDestructiveIndex = -1;
    private java.util.List<java.lang.String> buttonTitles = new java.util.ArrayList();
    private java.util.List<com.tencent.kinda.gen.VoidCallback> buttonCallbacks = new java.util.ArrayList();

    @Override // com.tencent.kinda.gen.KActionSheet
    public void addButtonImpl(java.lang.String str, com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.buttonTitles.add(str);
        this.buttonCallbacks.add(voidCallback);
    }

    @Override // com.tencent.kinda.gen.KActionSheet
    public boolean isShowing() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KActionSheet
    public void setCancelButtonTitle(java.lang.String str) {
        this.cancelTitle = str;
    }

    @Override // com.tencent.kinda.gen.KActionSheet
    public void setDestructiveIndex(int i17) {
        this.mDestructiveIndex = i17;
    }

    @Override // com.tencent.kinda.gen.KActionSheet
    public void setTitle(java.lang.String str) {
        this.title = str;
    }

    @Override // com.tencent.kinda.gen.KActionSheet
    public void show() {
        final android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity != null) {
            boolean z17 = this.title != null;
            this.sheet = new com.tencent.mm.ui.widget.dialog.k0(topOrUIPageFragmentActivity, 1, z17);
            if (z17) {
                android.view.View inflate = com.tencent.mm.ui.id.b(topOrUIPageFragmentActivity).inflate(com.tencent.mm.R.layout.f489272by3, (android.view.ViewGroup) null);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
                textView.setText(this.title);
                textView.setTextSize(14.0f);
                textView.setGravity(17);
                this.sheet.s(inflate, false);
            }
            this.sheet.f211872n = new db5.o4() { // from class: com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.1
                @Override // db5.o4
                public void onCreateMMMenu(db5.g4 g4Var) {
                    int i17 = 0;
                    for (java.lang.String str : com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.this.buttonTitles) {
                        if (com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.this.mDestructiveIndex < 0 || com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.this.mDestructiveIndex != i17) {
                            g4Var.add(0, i17, 0, str);
                        } else {
                            g4Var.d(i17, topOrUIPageFragmentActivity.getResources().getColor(com.tencent.mm.R.color.f478532ac), str);
                        }
                        i17++;
                    }
                }
            };
            this.sheet.f211881s = new db5.t4() { // from class: com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.2
                @Override // db5.t4
                public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
                    if (i17 < com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.this.buttonCallbacks.size()) {
                        ((com.tencent.kinda.gen.VoidCallback) com.tencent.kinda.framework.widget.base.KindaActionSheetImpl.this.buttonCallbacks.get(i17)).call();
                    }
                }
            };
            java.lang.String str = this.cancelTitle;
            if (str != null && !str.isEmpty()) {
                this.sheet.m(this.cancelTitle);
            }
            this.sheet.v();
        }
    }
}
