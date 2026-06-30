package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class EmojiStoreV2MainFragment extends com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment {
    public i12.o R;
    public boolean Q = false;
    public boolean S = false;

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.a7u;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public int n0() {
        return 5;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        if (this.S) {
            l0(bundle);
        } else {
            super.onActivityCreated(bundle);
        }
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        super.onAttach(activity);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        this.S = com.tencent.mm.plugin.emoji.model.EmojiLogic.a();
        super.onCreate(bundle);
        this.G.f56071e = 1;
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
        return true;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public j12.b r0() {
        i12.o oVar = new i12.o(getContext(), this.H);
        this.R = oVar;
        return oVar;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
        if (this.Q || !z17) {
            return;
        }
        this.Q = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 4, "", "", "", 1, 1);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment
    public void t0() {
        r45.zj0 zj0Var;
        com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct emoticonStoreActionStruct = this.G;
        try {
            android.widget.ListView listView = this.f98242q;
            if (listView != null && this.R != null) {
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int lastVisiblePosition = this.f98242q.getLastVisiblePosition();
                if (lastVisiblePosition - firstVisiblePosition <= 0) {
                    return;
                }
                boolean z17 = com.tencent.mm.plugin.emoji.model.o.a().f97588d;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                while (firstVisiblePosition < lastVisiblePosition) {
                    j12.i item = this.R.getItem(firstVisiblePosition);
                    if (item != null && (zj0Var = item.f297167b) != null) {
                        linkedList.add(new j22.j(firstVisiblePosition + 1, z17 ? zj0Var.f392147z : zj0Var.f392145x, zj0Var, item.f297176k));
                    }
                    firstVisiblePosition++;
                }
                emoticonStoreActionStruct.f56072f = 1;
                j22.j.f297257e.a(emoticonStoreActionStruct, linkedList);
                emoticonStoreActionStruct.k();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2MainFragment", e17, "", new java.lang.Object[0]);
        }
    }
}
