package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class EmojiStoreV2PersonFragment extends com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment {
    public boolean Q = false;
    public i12.s R;

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.a7w;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public void m0(int i17, int i18, com.tencent.mm.modelbase.m1 m1Var) {
        super.m0(i17, i18, m1Var);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView emojiStoreV2HotBarView = this.f98240o;
        if (emojiStoreV2HotBarView != null) {
            if (com.tencent.mm.plugin.emoji.model.o.a().f97587c) {
                emojiStoreV2HotBarView.f98254e.setText(com.tencent.mm.R.string.bwh);
            } else {
                emojiStoreV2HotBarView.f98254e.setText(com.tencent.mm.R.string.bwg);
            }
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public int n0() {
        return 9;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.G.f56071e = 2;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarView emojiStoreV2HotBarView = this.f98240o;
        if (emojiStoreV2HotBarView != null) {
            emojiStoreV2HotBarView.b();
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public boolean q0() {
        return false;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public j12.b r0() {
        i12.s sVar = new i12.s(getContext(), false);
        this.R = sVar;
        return sVar;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
        if (this.Q || !z17) {
            return;
        }
        this.Q = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 4, "", "", "", 2, 2);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public void t0() {
        r45.zj0 zj0Var;
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = this.G;
        try {
            int firstVisiblePosition = this.f98242q.getFirstVisiblePosition();
            if (firstVisiblePosition < 1) {
                firstVisiblePosition = 1;
            }
            int lastVisiblePosition = this.f98242q.getLastVisiblePosition();
            if (lastVisiblePosition - firstVisiblePosition <= 0) {
                return;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = firstVisiblePosition - 1; i17 < lastVisiblePosition - 1; i17++) {
                for (int i18 = 0; i18 < 3; i18++) {
                    i12.s sVar = this.R;
                    boolean z17 = sVar.f287240q;
                    int i19 = sVar.f287236m;
                    j12.i item = sVar.getItem((z17 ? i19 * i17 : (i19 * i17) + sVar.f287237n) + i18);
                    if (item != null && (zj0Var = item.f297167b) != null) {
                        linkedList.add(new j22.j(i17 + 1, zj0Var.f392130f, zj0Var, item.f297176k));
                    }
                }
            }
            emoticonStoreActionStruct.f56072f = 1;
            j22.j.f297257e.a(emoticonStoreActionStruct, linkedList);
            emoticonStoreActionStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2PersonFragment", e17, "", new java.lang.Object[0]);
        }
    }
}
